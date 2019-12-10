package singleton;

public class EagerSingleton {

    private static EagerSingleton eagerSingletonInstance = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getEagerSingleton() {
        return eagerSingletonInstance;
    }

    public static void main(String[] args) {
        System.out.println(getEagerSingleton());
    }

}
