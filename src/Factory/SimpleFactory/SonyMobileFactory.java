package Factory.SimpleFactory;

import Factory.product.SonyMobile;

/**
 * Created by SG on 2017/10/12.
 */
public class SonyMobileFactory {

    public static SonyMobile produce(String productID){

        SonyMobile mobile = null;

        try {
            mobile = (SonyMobile) Class.forName(productID).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return mobile;
    }

}
