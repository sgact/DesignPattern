package FlyWeight.out;

import FlyWeight.share.A_LetterMemo;

/**
 * Created by SG on 2017/10/18.
 */
public class A_Letter extends Letter {
    public A_Letter() {
        setLetterMemo(A_LetterMemo.getInstance());
    }
}
