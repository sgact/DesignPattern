package Bridge.myVersion;

/**
 * Created by SG on 2017/10/13.
 */
public abstract class Brush {

    protected abstract SetupStrokeColor setStrokeColorImpl();
    protected abstract SetupStrokeWidth setStrokeWidthImpl();

    public void paint(String word) {
        System.out.println(
                "写下了一个" +
                setStrokeColorImpl().setStrokeColor() +
                setStrokeWidthImpl().setStrokeWidth() +
                "的[ " + word + " ]字"
        );

    }


}
