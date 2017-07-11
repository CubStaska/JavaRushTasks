package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file = args[0];
        int allcount=0;
        int spacecount=0;
        int data=0;
        Locale locale = new Locale("en");
        Locale.setDefault(locale);
        DecimalFormat decimalFormat = new DecimalFormat("##0.00");
        FileInputStream fileInputStream = new FileInputStream(file);
        while (fileInputStream.available() > 0){
            data = fileInputStream.read();
            if (" ".indexOf(data) > -1) {
                spacecount++;
            }
            allcount++;
        }
        System.out.println(decimalFormat.format((double) spacecount/(double) allcount*100));
        fileInputStream.close();
    }
}


