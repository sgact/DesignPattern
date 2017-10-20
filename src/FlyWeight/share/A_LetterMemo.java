package FlyWeight.share;

/**
 * @author sg
 * Created by SG on 2017/10/18.
 */
public class A_LetterMemo  extends LetterMemo {

    private A_LetterMemo(){}

    private static A_LetterMemo mInstance;

    public static A_LetterMemo getInstance(){
        if (mInstance == null) {
            mInstance = new A_LetterMemo();
            mInstance.letter = "A";
        }
        return mInstance;
    }
}
