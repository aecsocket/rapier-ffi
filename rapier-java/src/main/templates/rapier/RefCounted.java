package rapier;

public interface RefCounted {
    long strongCount();

    void increment();

    void decrement();
}
