package Prototype.deep;

import java.io.Serializable;

/**
 * Created by SG on 2017/10/12.
 */
public class JinGuBangSerialize implements Serializable {

    private int weight = 13500 / 2;

    private String alias = "定海神针";

    public int getWeight() {
        return weight;
    }

    public String getAlias() {
        return alias;
    }
}
