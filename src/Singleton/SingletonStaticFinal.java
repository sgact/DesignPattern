package Singleton;

/**
 * Created by SG on 2017/10/12.
 */
public class SingletonStaticFinal extends SingletonBase {

    /**
     * 因为单例的实例被声明成 static 和 final 变量了，在第一次加载类到内存中时就会初始化，
     * 所以创建实例本身是线程安全的。
     */
    private static final SingletonStaticFinal mInstance = new SingletonStaticFinal();

    private SingletonStaticFinal(){}

    public static SingletonStaticFinal getInstance(){
        return mInstance;
    }
}
