package Proxy.VirtualProxy;

/**
 * Created by SG on 2017/10/19.
 */
public class VirtualProxyClient {

    public static void main(String[] argv){

        PictureProxy pictureProxy = new PictureProxy();


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int cnt = 0;
                    while (true && cnt < 20){
                        Thread.sleep(300);
                        pictureProxy.showPicture();
                        cnt++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}
