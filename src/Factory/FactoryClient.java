package Factory;

import Factory.FactoryMethod.XZFactory;
import Factory.FactoryMethod.Z3CFactory;
import Factory.SimpleFactory.MobileConfig;
import Factory.SimpleFactory.SonyMobileFactory;

/**
 * Created by SG on 2017/10/12.
 */
public class FactoryClient {

    public static void main(String[] argv){

        //Simple Factory
        SonyMobileFactory.produce(MobileConfig.SonyXZID);
        SonyMobileFactory.produce(MobileConfig.SonyZ3CID);

        //Factory Method
        new XZFactory().produceSonyMobile();
        new Z3CFactory().produceSonyMobile();

        //Abstract Factory
        new Factory.AbstractFactory.XZFactory().install();
        new Factory.AbstractFactory.Z3CFactory().install();


    }

}
