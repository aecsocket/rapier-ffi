package rapier;

public abstract sealed class BaseNative implements Native permits RefNative {
    @Override
    public String toString() {
        return "%s@0x%x".formatted(getClass().getSimpleName(), memory().address().toRawLongValue());
    }
}
