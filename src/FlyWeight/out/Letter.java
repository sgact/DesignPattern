package FlyWeight.out;

import FlyWeight.share.LetterMemo;

/**
 * Created by SG on 2017/10/18.
 */
public class Letter {

    protected String color;

    protected LetterMemo letterMemo;

    public void setLetterMemo(LetterMemo letterMemo) {
        this.letterMemo = letterMemo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {

        return color + " " + letterMemo.getLetter();
    }
}
