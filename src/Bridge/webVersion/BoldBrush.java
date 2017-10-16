package Bridge.webVersion;

import Bridge.myVersion.Brush;
import Builder.AbsBuilder;

/**
 * Created by SG on 2017/10/13.
 */
public class BoldBrush extends AbsBrush {

    @Override
    public void drawText(String text) {
        System.out.print("写下了一个粗体" + ink.changeBrushColor() + "[ " + text + " ]字");
    }
}
