package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream openstream = new FileInputStream(filename);
        int min=65535;
        int readbyte;
        while (openstream.available() > 0){
            readbyte = openstream.read();
            if (min > readbyte) {
                min = min(min, readbyte);
            }
        }
        System.out.println(min);
        openstream.close();
    }

    public static int min(int a, int b){
        if (a < b){
            return a;
        }else {
            return b;
        }
    }
}
