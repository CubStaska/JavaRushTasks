package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JULY 1 1980"));
        map.put("Stallone3", new Date("JULY 1 1980"));
        map.put("Stallone4", new Date("JULY 1 1980"));
        map.put("Stallone5", new Date("JULY 1 1980"));
        map.put("Stallone6", new Date("JULY 1 1980"));
        map.put("Stallone7", new Date("JULY 1 1980"));
        map.put("Stallone8", new Date("JULY 1 1980"));
        map.put("Stallone9", new Date("JULY 1 1980"));
        map.put("Stallone10", new Date("JAN 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = (Map.Entry) iterator.next();
            if (pair.getValue().getMonth() == 5) {
                iterator.remove();
            }
            if (pair.getValue().getMonth() == 6) {
                iterator.remove();
            }
            if (pair.getValue().getMonth() == 7) {
                iterator.remove();
            }


        }


    }

    public static void main(String[] args) {
        removeAllSummerPeople(createMap());
    }
}
