package Adapter;


/**
 * Created by SG on 2017/10/13.
 */
public class PhoneAdapter extends AbsAdapter {

    public static final int inputVoltage = 220;
    public static final int outputVoltage = 5;

    @Override
    public void linkTarget(int voltage){
        if (voltage != inputVoltage){
            System.out.println("适配器烧毁");
            return;
        }else if (chargable != null){
            int output = changeVoltage(voltage);
            chargable.inCharge(output);
        }
    }

    @Override
    public int changeVoltage(int inputVoltage){
        return outputVoltage;
    }
}
