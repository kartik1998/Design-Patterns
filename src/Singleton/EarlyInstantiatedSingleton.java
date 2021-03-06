package Singleton;

public class EarlyInstantiatedSingleton {
    private static EarlyInstantiatedSingleton singleton = new EarlyInstantiatedSingleton();
    private EarlyInstantiatedSingleton() {}
    public static EarlyInstantiatedSingleton getInstance() {
        return singleton;
    }
    public static void printObject() {
        System.out.println("Singleton Object" + singleton);
    }
}
