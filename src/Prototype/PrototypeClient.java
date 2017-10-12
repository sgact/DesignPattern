package Prototype;

import Prototype.deep.SunWuKongDeep;
import Prototype.sallow.SunWuKong;

import java.io.IOException;

/**
 * Created by SG on 2017/10/12.
 */
public class PrototypeClient {

    public static void main(String[] argv) throws IOException, ClassNotFoundException {

        //浅拷贝
        SunWuKong wuKong = new SunWuKong();
        SunWuKong wuKongFromHair = wuKong.clone();

        System.out.println(wuKong == wuKongFromHair);
        System.out.println(wuKong.getJinGuBang() == wuKongFromHair.getJinGuBang());

        //深拷贝
        SunWuKongDeep wuKongDeep = new SunWuKongDeep();
        SunWuKongDeep wukongDeepFromHair = wuKongDeep.deepClone();

        System.out.println(wuKongDeep == wukongDeepFromHair);
        System.out.println(wuKongDeep.getJinGuBang() == wukongDeepFromHair.getJinGuBang());

    }
}
