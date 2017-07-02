package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> list = new HashMap<>();
        list.put("Андреев", 1500);
        list.put("Аседова",420);
        list.put("Валинуров",380);
        list.put("Гаранян",2000);
        list.put("Горинова",2200);
        list.put("Ермохин", 490);
        list.put("Иванов",380);
        list.put("Ильин",700);
        list.put("Капитонов",320);
        list.put("Клинова",200);
        return list;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String,Integer> mapcopy = new HashMap<>(map);

        for (Map.Entry<String,Integer> m: mapcopy.entrySet()) {
            if (m.getValue() < 500){
                map.remove(m.getKey(),m.getValue());
            }
        }

    }

    public static void main(String[] args) {

    }
}