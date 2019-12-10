package singleton;

public class LazySingleton {

    private static LazySingleton lazySingletonInstance = null;

    private LazySingleton() {

    }

    public static LazySingleton getLazySingletonInstance() {

        {
            if (lazySingletonInstance == null) {
                lazySingletonInstance = new LazySingleton();
            }
            return lazySingletonInstance;
        }

    }

    public static void main(String[] args) {
        System.out.println(getLazySingletonInstance());
    }

}
