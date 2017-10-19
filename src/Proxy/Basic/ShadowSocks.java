package Proxy.Basic;

/**
 * Created by SG on 2017/10/19.
 */
public class ShadowSocks extends VPS{

    private VPS vps;

    public void setVps(VPS vps) {
        this.vps = vps;
    }

    private void onPreRequest(){
        System.out.println("开始请求google.com");
    }

    private void onPostRequest(){
        System.out.println("完成请求google.com");
    }

    @Override
    public void doRequest() {
        onPreRequest();
        vps.doRequest();
        onPostRequest();
    }
}
