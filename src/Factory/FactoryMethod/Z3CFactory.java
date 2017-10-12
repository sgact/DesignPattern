package Factory.FactoryMethod;

import Factory.product.SonyMobile;
import Factory.product.SonyZ3C;

/**
 * Created by SG on 2017/10/12.
 */
public class Z3CFactory implements ProduceSonyMobile {
    @Override
    public SonyMobile produceSonyMobile() {
        return new SonyZ3C();
    }
}
