package org.scalerAdaptive.binarySearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TimeBasedKeyValueStore {
    HashMap<String,String> hm;
    List<Integer> list;

    public static void main(String[] args) {
        TimeBasedKeyValueStore store = new TimeBasedKeyValueStore();
        store.set("foo", "bar", 1);
        System.out.println(store.get("foo", 1)); // returns "bar"
        System.out.println(store.get("foo", 3)); // returns "bar"
        store.set("foo", "baz", 4);
        System.out.println(store.get("foo", 4)); // returns "baz"
        System.out.println(store.get("foo", 5)); // returns "baz"
        System.out.println(store.get("foo", 2)); // returns "bar"
    }

    public TimeBasedKeyValueStore() {
        hm=new HashMap();
        list=new ArrayList();
    }

    public void set(String key, String value, int timestamp) {
        String k=key+"_"+timestamp;
        hm.put(k,value);
        list.add(timestamp);
    }

    public String get(String key, int timestamp) {
        String k=key+"_"+timestamp;
        if(hm.containsKey(k)){
            return hm.get(k);
        }else {

            for(String existKey:hm.keySet()){

                if(existKey.contains(key)){
                    existKey=existKey.lastIndexOf("_")!=-1 ? existKey.substring(0,existKey.lastIndexOf("_")) : existKey;
                    existKey=existKey+"_"+list.get(list.size()-1);
                    return  hm.get(existKey);
                }
            }
            return "";
        }


    }

}
