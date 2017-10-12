package Prototype.deep;

import Prototype.sallow.JinGuBang;

import java.io.*;

/**
 * Created by SG on 2017/10/12.
 */
public class SunWuKongDeep implements Cloneable , Serializable{

    private String age = "500";

    private JinGuBangSerialize jinGuBang = new JinGuBangSerialize();

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public JinGuBangSerialize getJinGuBang() {
        return jinGuBang;
    }

    public SunWuKongDeep deepClone() throws IOException, ClassNotFoundException {

        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (SunWuKongDeep) ois.readObject();
    }
}
