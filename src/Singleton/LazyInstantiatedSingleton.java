package Singleton;

/**
 * @description: We create the instance of the class in synchronized method or synchronized block, so instance of the class is created when required.
 */
public class LazyInstantiatedSingleton {
    private static LazyInstantiatedSingleton singleton;
    private LazyInstantiatedSingleton() {};

    public static LazyInstantiatedSingleton getInstance() {
        if(singleton == null) {
            synchronized (LazyInstantiatedSingleton.class) {
                singleton = new LazyInstantiatedSingleton();
            }
        }
        return singleton;
    }

    public static void printObject() {
        System.out.println("Singleton : " + singleton);
    }
}
