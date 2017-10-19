package Proxy.VirtualProxy;

/**
 * Created by SG on 2017/10/19.
 */
public class Bitmap extends PictureToShow {
    @Override
    public void showPicture() {
        System.out.println("显示完整图片");
    }

    private boolean isReady = false;

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public void init(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    setReady(true);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
