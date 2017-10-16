package Bridge.webVersion;

/**
 * Created by SG on 2017/10/13.
 */
public class ThinBrush extends AbsBrush {
    @Override
    public void drawText(String text) {
        System.out.print("写下了一个细体" + ink.changeBrushColor() + "[ " + text + " ]字");
    }
}
