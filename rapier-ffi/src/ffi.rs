pub(crate) fn leak_ptr<T>(t: T) -> *mut T {
    Box::leak(Box::new(t))
}

pub(crate) unsafe fn drop_ptr<T>(raw: *mut T) {
    drop(Box::from_raw(raw))
}

#[inline]
#[track_caller]
fn ptr_panic<T: ?Sized>(ptr: *const T) -> ! {
    panic!(
        "passed invalid pointer to foreign function: {:x}",
        ptr as *const () as usize
    );
}

pub(crate) trait ConstOrAbort<T: ?Sized> {
    unsafe fn get<'a>(self) -> &'a T;
}

impl<T: ?Sized> ConstOrAbort<T> for *const T {
    #[inline]
    #[track_caller]
    unsafe fn get<'a>(self) -> &'a T {
        match self.as_ref() {
            Some(t) => t,
            None => ptr_panic(self),
        }
    }
}

impl<T: ?Sized> ConstOrAbort<T> for *mut T {
    #[inline]
    #[track_caller]
    unsafe fn get<'a>(self) -> &'a T {
        match self.as_ref() {
            Some(t) => t,
            None => ptr_panic(self),
        }
    }
}

pub(crate) trait MutOrAbort<T: ?Sized>: ConstOrAbort<T> {
    unsafe fn get_mut<'a>(self) -> &'a mut T;
}

impl<T: ?Sized> MutOrAbort<T> for *mut T {
    #[inline]
    #[track_caller]
    unsafe fn get_mut<'a>(self) -> &'a mut T {
        match self.as_mut() {
            Some(t) => t,
            None => ptr_panic(self),
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
