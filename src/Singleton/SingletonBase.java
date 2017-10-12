package Singleton;

/**
 * Created by SG on 2017/10/12.
 */
public class SingletonBase {

    private final String name = getClass().getSimpleName();

    protected void selfIntroduce(){
        System.out.println("I am " + name);
    }
}
