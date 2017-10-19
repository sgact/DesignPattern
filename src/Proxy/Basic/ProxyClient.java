package Proxy.Basic;

/**
 * Created by SG on 2017/10/19.
 */
public class ProxyClient {

    public static void main(String[] argv){

        ShadowSocks shadowSocks = new ShadowSocks();
        JapanVPS japanVPS = new JapanVPS();
        AmericaVPS americaVPS = new AmericaVPS();

        shadowSocks.setVps(americaVPS);
        shadowSocks.doRequest();
    }
}
