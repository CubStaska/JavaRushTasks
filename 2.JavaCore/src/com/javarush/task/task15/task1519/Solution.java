package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String data;

       while (true) {
                data = reader.readLine();

               try {
                   if (data.equals("exit")){
                       break;
                   }

                   if (data.contains("."))
                       print(Double.parseDouble(data));
                   else if (Integer.parseInt(data) >= 128 || Integer.parseInt(data) <= 0)
                       print(Integer.parseInt(data));
                   else if ((Short.parseShort(data) < 128) && (Short.parseShort(data) > 0))
                       print(Short.parseShort(data));
                   else print(data);
               } catch (NumberFormatException e) {
                   print(data);
               }


       }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
