package Proxy.Basic;

/**
 * Created by SG on 2017/10/19.
 */
public class JapanVPS extends VPS {
    @Override
    public void doRequest() {
        System.out.println("Response: www.google.jp -html");
    }
}
