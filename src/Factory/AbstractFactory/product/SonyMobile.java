package Factory.AbstractFactory.product;

import Factory.AbstractFactory.Camera;
import Factory.AbstractFactory.Ram;

/**
 * Created by SG on 2017/10/12.
 */
public class SonyMobile {

    protected Ram ram;

    protected Camera camera;

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Ram:" + ram.ramDesc + "," + "Camera" + camera.cameraDesc;
    }
}
