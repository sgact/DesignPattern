package Builder;

/**
 * Created by SG on 2017/10/12.
 */
public class XZBuilder extends AbsBuilder {
    @Override
    public AbsBuilder setRam() {
        phone.setRam("祖传3G");
        return this;
    }

    @Override
    public AbsBuilder setScreen() {
        phone.setScreen("5.2寸");
        return this;
    }

    @Override
    public AbsBuilder setColor() {
        phone.setColor("骚蓝色");
        return this;
    }
}
