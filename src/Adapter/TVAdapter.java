package Adapter;

/**
 * Created by SG on 2017/10/13.
 */
public class TVAdapter extends AbsAdapter {

    public static final int inputVoltage = 220;
    public static final int outputVoltage = 100;


    @Override
    public int changeVoltage(int voltageInput) {
        return outputVoltage;
    }

    @Override
    public void linkTarget(int voltage) {
        if (voltage != inputVoltage){
            System.out.println("电视适配器爆炸");
        }else{
            int output = changeVoltage(voltage);
            chargable.inCharge(output);
        }
    }
}
