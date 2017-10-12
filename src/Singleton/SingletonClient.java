package Singleton;

/**
 * Created by SG on 2017/10/12.
 */
public class SingletonClient {

    public static void main(String[] argv){

        SingletonPrimary.getInstance().selfIntroduce();
        SingletonDoubleCheck.getInstance().selfIntroduce();
        SingletonDCWithVolatile.getInstance().selfIntroduce();
        SingletonStaticFinal.getInstance().selfIntroduce();
        SingletonSFLazy.getInstance().selfIntroduce();

    }
}
