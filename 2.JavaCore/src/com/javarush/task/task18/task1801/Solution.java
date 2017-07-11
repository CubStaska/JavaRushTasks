package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream openstream = new FileInputStream(filename);
        int max=0;
        int readbyte;
        while (openstream.available() > 0){
            readbyte = openstream.read();
            if (max < readbyte) {
                max = max(max, readbyte);
            }
        }
        System.out.println(max);
        openstream.close();
    }

    public static int max(int a, int b){
        if (a > b){
            return a;
        }else {
            return b;
        }
    }
}
