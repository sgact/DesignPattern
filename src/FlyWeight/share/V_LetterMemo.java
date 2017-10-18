package FlyWeight.share;

/**
 * Created by SG on 2017/10/18.
 */
public class V_LetterMemo extends LetterMemo {

    private V_LetterMemo(){}

    private static V_LetterMemo mInstance;

    public static V_LetterMemo getInstance(){
        if (mInstance == null) {
            mInstance = new V_LetterMemo();
            mInstance.letter = "A";
        }
        return mInstance;
    }
}
