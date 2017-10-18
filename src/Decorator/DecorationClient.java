package Decorator;

/**
 * Created by SG on 2017/10/18.
 */
public class DecorationClient {

    public static void main(String[] argv){

        Button button = new Button();

        BlackBorderDecor bb = new BlackBorderDecor();
        bb.setView(button);

        bb.display();

        RedBackgroundDecor rb = new RedBackgroundDecor();
        rb.setView(bb);

        rb.display();

    }
}
