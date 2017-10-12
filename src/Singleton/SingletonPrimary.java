package Singleton;

/**
 * Created by SG on 2017/10/12.
 */
public class SingletonPrimary extends SingletonBase {

    private static SingletonPrimary instance;

    private SingletonPrimary(){}

    public static SingletonPrimary getInstance() {
        if (instance == null) {
            instance = new SingletonPrimary();
        }
        return instance;
    }

}
