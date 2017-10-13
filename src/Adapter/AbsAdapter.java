package Adapter;

/**
 * Created by SG on 2017/10/13.
 */
public abstract class AbsAdapter {

    protected Chargable chargable;

    public void setChargable(Chargable chargable) {
        this.chargable = chargable;
    }

    public abstract int changeVoltage(int voltageInput);

    public abstract void linkTarget(int voltage);
}
