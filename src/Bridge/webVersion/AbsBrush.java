package Bridge.webVersion;

/**
 * Created by SG on 2017/10/13.
 */
public abstract class AbsBrush {

    protected Ink ink;

    public void dipInk(Ink ink) {
        this.ink = ink;
    }

    public abstract void drawText(String text);

}
