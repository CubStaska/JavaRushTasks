package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader readerurl = new BufferedReader(new InputStreamReader(System.in));
        String url = readerurl.readLine();
        String [] parsestr = url.split("\\?")[1].split("&");
        String [] result;
        Double res = null;
        String s = null;
        for (String p: parsestr) {
            result = p.split("=");
            try {
                System.out.print(result[0] + " ");
                if (result[0].equals("obj")){
                   res =  Double.valueOf(result[1]);
                }
            } catch (Exception e){
               s = result[1];
            }
        }
        System.out.println();
        if (res != null) {
            alert(res);
        }
        if (s != null) {
            alert(s);
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
