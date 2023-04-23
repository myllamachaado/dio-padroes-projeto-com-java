package singleton;

public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonLazy getInstance(SingletonLazy instance){
        return instance;
    }

}
