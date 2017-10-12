package Builder;

/**
 * Created by SG on 2017/10/12.
 */
public class Z3CBuilder extends AbsBuilder{

    @Override
    public AbsBuilder setRam() {
        phone.setRam("2G够用");
        return this;
    }

    @Override
    public AbsBuilder setScreen() {
        phone.setScreen("4.7寸");
        return this;
    }

    @Override
    public AbsBuilder setColor() {
        phone.setColor("腮红色");
        return this;
    }
}
