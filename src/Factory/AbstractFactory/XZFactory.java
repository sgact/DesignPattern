package Factory.AbstractFactory;

import Factory.AbstractFactory.product.SonyMobile;
import Factory.AbstractFactory.product.SonyXZ;

/**
 * Created by SG on 2017/10/12.
 */
public class XZFactory extends AbstractFactory{

    @Override
    public Ram createRam() {
        return new Ram("祖传3G");
    }

    @Override
    public Camera createCamera() {
        return new Camera("4轴防抖");
    }

    @Override
    public SonyMobile createMainBody() {
        return new SonyXZ();
    }
}
