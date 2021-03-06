package Singleton;

public class Main {
    public static void main(String[] args) {
        /**
         * @EarlyInstantiatedSingleton Creates Instance in load time
         */
        EarlyInstantiatedSingleton singleton = EarlyInstantiatedSingleton.getInstance();
        singleton.printObject();
    }
}
