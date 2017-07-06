package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
       Solution.reset();
    }

    public static Flyable result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String param;
        int passangir;
        try {
            param = reader.readLine();
            if (param.equals("helicopter")){
                result = new Helicopter();
            }
            if (param.equals("plane")){
                passangir = Integer.parseInt(reader.readLine());
                result = new Plane(passangir);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
