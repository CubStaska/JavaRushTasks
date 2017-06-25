package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> list = new HashMap<>();
        list.put("Андреев", "Александр");
        list.put("Аседова","Елизавета");
        list.put("Валинуров","Денис");
        list.put("Гаранян","Ованес");
        list.put("Горинова","Юлия");
        list.put("Ермохин", "Макар");
        list.put("Иванов","Макар");
        list.put("Ильин","Макар");
        list.put("Капитонов","Макар");
        list.put("Клинова","Татьяна");
        return list;


    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String,String> m :map.entrySet()) {
            if (m.getValue().equals(name)){
                count++;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String,String> m :map.entrySet()) {
            if (m.getKey().equals(lastName)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
