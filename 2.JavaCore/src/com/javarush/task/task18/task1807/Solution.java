package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileopen = new FileInputStream(reader.readLine());
        int count=0;
       while (fileopen.available() > 0){
           if (fileopen.read() == (byte) ','){
               count++;
           }
       }
        System.out.println(count);
       fileopen.close();
    }
}
