package Factory.AbstractFactory;

import Factory.AbstractFactory.product.SonyMobile;
import Factory.AbstractFactory.product.SonyZ3C;

/**
 * Created by SG on 2017/10/12.
 */
public class Z3CFactory extends AbstractFactory {
    @Override
    public Ram createRam() {
        return new Ram("2G");
    }

    @Override
    public Camera createCamera() {
        return new Camera("2000w 像素");
    }

    @Override
    public SonyMobile createMainBody() {
        return new SonyZ3C();
    }
}
