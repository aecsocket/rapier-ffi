use std::io::Write;

pub(crate) fn leak_ptr<T>(t: T) -> *mut T {
    Box::leak(Box::new(t))
}

pub(crate) unsafe fn drop_ptr<T>(raw: *mut T) {
    drop(Box::from_raw(raw))
}

#[track_caller]
fn print_and_abort() -> ! {
    let location = std::panic::Location::caller();
    let mut stderr = std::io::stderr();
    let _ = writeln!(
        stderr,
        "passed null pointer to function expecting non-null pointer, aborting. {file}:{line}:{column}",
        file = location.file(),
        line = location.line(),
        column = location.column(),
    );
    let _ = stderr.flush();
    std::process::abort()
}

pub(crate) trait ConstOrAbort<T: ?Sized> {
    unsafe fn get<'a>(self) -> &'a T;
}

impl<T: ?Sized> ConstOrAbort<T> for *const T {
    #[inline]
    unsafe fn get<'a>(self) -> &'a T {
        if self.is_null() {
            print_and_abort()
        } else {
            unsafe { &*self }
        }
    }
}

impl<T: ?Sized> ConstOrAbort<T> for *mut T {
    #[inline]
    unsafe fn get<'a>(self) -> &'a T {
        if self.is_null() {
            print_and_abort()
        } else {
            unsafe { &*self }
        }
    }
}

pub(crate) trait MutOrAbort<T: ?Sized>: ConstOrAbort<T> {
    unsafe fn get_mut<'a>(self) -> &'a mut T;
}

impl<T: ?Sized> MutOrAbort<T> for *mut T {
    #[inline]
    unsafe fn get_mut<'a>(self) -> &'a mut T {
        if self.is_null() {
            print_and_abort()
        } else {
            unsafe { &mut *self }
        }
    }
}

pub trait Rewrite<T> {
    unsafe fn rewrite<F>(self, func: F)
    where
        F: FnOnce(T) -> T;
}

impl<T> Rewrite<T> for *mut T {
    #[inline]
    unsafe fn rewrite<F>(self, func: F)
    where
        F: FnOnce(T) -> T,
    {
        self.write(func(self.read()))
    }
}
