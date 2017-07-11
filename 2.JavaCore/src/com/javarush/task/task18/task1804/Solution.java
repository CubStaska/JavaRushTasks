package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileIn = new FileInputStream(buff.readLine());
        Map<Byte,Integer> counterByte = new HashMap();
        Integer num = counterByte.size();
        while (fileIn.available() > 0) {
            Byte key = (byte) fileIn.read();
            if (counterByte.containsKey(key)) {
                counterByte.put(key, counterByte.get(key) + 1);
            } else counterByte.put(key, 0);
        }
        for (Map.Entry<Byte,Integer> sort : counterByte.entrySet()) {
            if (sort.getValue() < num)
                num = (Integer) sort.getValue();
        }
        for (Map.Entry sortid : counterByte.entrySet()) {
            if (sortid.getValue() == num) {
                System.out.print(sortid.getKey() + " ");
            }
        }
        buff.close();
        fileIn.close();
    }
}
