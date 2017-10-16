package Bridge.webVersion;

/**
 * Created by SG on 2017/10/13.
 */
public class BridgeClient {

    public static void main(String[] argv){
        AbsBrush brush = new BoldBrush();
        brush.dipInk(new YellowInk());
        brush.drawText("翔");
    }
}
