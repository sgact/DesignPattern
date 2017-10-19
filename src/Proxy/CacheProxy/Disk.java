package Proxy.CacheProxy;

import java.util.Hashtable;

/**
 * Created by SG on 2017/10/19.
 */
public class Disk extends  Memeory{

    private Hashtable<String, String> diskMem;

    public Disk() {
        diskMem = new Hashtable<>();
        diskMem.put("Green", "#00FF00");
        diskMem.put("Red", "#0000FF");
        diskMem.put("Blue", "#FF0000");
        diskMem.put("White", "#FFFFFF");
        diskMem.put("Black", "#000000");
    }

    @Override
    public String readMemOf(String key) {
        return diskMem.get(key);
    }
}
