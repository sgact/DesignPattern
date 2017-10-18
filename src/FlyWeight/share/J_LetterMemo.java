package FlyWeight.share;

/**
 * Created by SG on 2017/10/18.
 */
public class J_LetterMemo extends LetterMemo {

    private J_LetterMemo(){}

    private static J_LetterMemo mInstance;

    public static J_LetterMemo getInstance(){
        if (mInstance == null) {
            mInstance = new J_LetterMemo();
            mInstance.letter = "J";
        }
        return mInstance;
    }

}
