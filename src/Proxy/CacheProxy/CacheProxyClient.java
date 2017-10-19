package Proxy.CacheProxy;

/**
 * Created by SG on 2017/10/19.
 */
public class CacheProxyClient {

    public static void main(String[] argv){

        MemProxy memProxy = new MemProxy();

        memProxy.readMemOf("Green");
        memProxy.readMemOf("Black");
        memProxy.readMemOf("White");
        memProxy.readMemOf("Black");



    }

}
