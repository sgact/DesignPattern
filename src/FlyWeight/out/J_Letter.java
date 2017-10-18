package FlyWeight.out;

import FlyWeight.share.J_LetterMemo;

/**
 * Created by SG on 2017/10/18.
 */
public class J_Letter extends Letter {

    public J_Letter() {
        setLetterMemo(J_LetterMemo.getInstance());
    }
}
