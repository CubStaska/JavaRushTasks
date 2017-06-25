package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String,String> list = new HashMap<>();
        list.put("Андреев", "Александр");
        list.put("Аседова","Елизавета");
        list.put("Аседова","Денис");
        list.put("Гаранян","Ованес");
        list.put("Горинова","Юлия");
        list.put("Ермохин", "Макар");
        list.put("Иванов","Макар");
        list.put("Аседова","Макар");
        list.put("Капитонов","Макар");
        list.put("Клинова","Татьяна");

        return list;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
