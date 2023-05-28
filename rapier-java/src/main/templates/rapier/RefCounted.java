package rapier;

public interface RefCounted {
    long strongCount();

    void acquire();

    void release();
}
