package singleton;

public class SingletonLazy {

    /* Permite a criação de uma única instância de uma classe e fornecer um modo para recuperá-la
    * Permite que uma determinada instância seja criada de forma única e reutilizada
    */

    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance(SingletonLazy instance){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }

}
