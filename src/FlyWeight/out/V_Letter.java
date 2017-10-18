package FlyWeight.out;

import FlyWeight.share.V_LetterMemo;

/**
 * Created by SG on 2017/10/18.
 */
public class V_Letter  extends Letter {
    public V_Letter() {
        setLetterMemo(V_LetterMemo.getInstance());
    }
}

