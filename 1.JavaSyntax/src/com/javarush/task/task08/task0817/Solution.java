package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap map = new HashMap();
        map.put("a", "d");
        map.put("b", "d");
        map.put("c", "d");
        map.put("d", "d");
        map.put("i", "i");
        map.put("z", "i");
        map.put("f", "o");
        map.put("g", "o");
        map.put("h", "o");
        map.put("j", "p");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
       HashMap<String,String> copymap = new HashMap<>(map);
       HashSet<String> set = new HashSet<>();

        for (Map.Entry<String,String> m: copymap.entrySet()) {
            if (!set.add(m.getValue())){
                removeItemFromMapByValue(map,m.getValue());
            }

        }

    }


    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
