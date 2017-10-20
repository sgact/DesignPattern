package Adapter;

/**
 * Created by SG on 2017/10/13.
 */
public class Phone implements Chargable{

    public static final int voltageIn = 5;

    private Thread chargingThread = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(1000);
                    System.out.println("手机充电中...");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });

    @Override
    public void inCharge(int voltage){
        if (voltage != voltageIn){
            System.out.println("手机爆炸");
        }else{
            chargingThread.start();
        }
    }

}
