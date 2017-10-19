package Proxy.CacheProxy;

import java.util.Hashtable;

/**
 * Created by SG on 2017/10/19.
 */
public class Cache extends Memeory{

    private Hashtable<String, String> cacheMem = new Hashtable<>();

    @Override
    public String readMemOf(String key) {
        return cacheMem.get(key);
    }

    public void put(String key, String value){
        cacheMem.put(key, value);
        System.out.println("向Cache中加入映射" + key + " -> " + value);
    }

    public boolean has(String key){
        return cacheMem.containsKey(key);
    }
}
