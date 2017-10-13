package Adapter;

/**
 * Created by SG on 2017/10/13.
 */
public class TV100V implements Chargable{

    public static final int voltageIn = 100;

    private Thread playThread = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(1000);
                    System.out.println("正在播放新闻联播...");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });

    @Override
    public void inCharge(int voltage) {
        if (voltage != 100){
            System.out.println("电视爆炸");
        }else{
            playThread.start();
        }
    }
}
