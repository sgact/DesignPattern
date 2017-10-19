package Proxy.VirtualProxy;

/**
 * Created by SG on 2017/10/19.
 */
public class PictureProxy extends PictureToShow {

    private Bitmap bitmap = new Bitmap();

    private LoadingPicture loading = new LoadingPicture();

    @Override
    public void showPicture() {
        startInitBitmap();
        if (bitmap.isReady()){
            bitmap.showPicture();
        }else{
            loading.showPicture();
        }
    }

    private void startInitBitmap() {
        bitmap.init();
    }

}
