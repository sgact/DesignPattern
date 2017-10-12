package Singleton;

/**
 * Created by SG on 2017/10/12.
 */
public class SingletonSFLazy extends SingletonBase {

    private SingletonSFLazy(){}

    public static SingletonSFLazy getInstance(){
        return SingletonHolder.mInstance;
    }

    private static class SingletonHolder{
        public static final SingletonSFLazy mInstance = new SingletonSFLazy();
    }

}
