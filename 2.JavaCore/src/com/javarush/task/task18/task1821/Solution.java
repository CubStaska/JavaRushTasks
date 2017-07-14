package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<Integer,Integer> map = new TreeMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        while (reader.ready()){
            list.add(reader.read());
        }
        for (Integer l : list) {
            if (!map.containsKey(l)){
                map.put(l,1);
            }else {
                map.put(l,map.get(l)+1);
            }
        }

        for (Map.Entry<Integer,Integer> m: map.entrySet()) {
            System.out.println((char)(int) m.getKey() + " " + m.getValue());
        }
        reader.close();
    }
}

