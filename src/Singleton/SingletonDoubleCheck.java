package Singleton;

/**
 * Created by SG on 2017/10/12.
 */
public class SingletonDoubleCheck extends SingletonBase {

    private static SingletonDoubleCheck mInstance;

    private SingletonDoubleCheck(){};

    public static SingletonDoubleCheck getInstance(){

        if (mInstance == null) {
            synchronized (SingletonDoubleCheck.class){
                if (mInstance == null) {
                    mInstance = new SingletonDoubleCheck();
                }
            }
        }
        return mInstance;
    }

}
