package Factory.AbstractFactory;


import Factory.AbstractFactory.product.SonyMobile;

/**
 * Created by SG on 2017/10/12.
 */
public abstract class AbstractFactory {

    public abstract Ram createRam();

    public abstract Camera createCamera();

    public abstract SonyMobile createMainBody();

    public SonyMobile install(){
        SonyMobile mobile = createMainBody();
        mobile.setCamera(createCamera());
        mobile.setRam(createRam());

        System.out.println(mobile.toString());

        return mobile;
    }
}
