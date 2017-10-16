package Bridge.myVersion;

/**
 * Created by SG on 2017/10/13.
 */
public class Blue2pxBrush extends Brush {
    @Override
    protected SetupStrokeColor setStrokeColorImpl() {
        return new ColorBlueImpl();
    }

    @Override
    protected SetupStrokeWidth setStrokeWidthImpl() {
        return new Width2xImpl();
    }
}
