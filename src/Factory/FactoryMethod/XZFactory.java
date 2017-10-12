package Factory.FactoryMethod;

import Factory.product.SonyMobile;
import Factory.product.SonyXZ;

/**
 * Created by SG on 2017/10/12.
 */
public class XZFactory implements ProduceSonyMobile {
    @Override
    public SonyMobile produceSonyMobile() {
        return new SonyXZ();
    }
}
