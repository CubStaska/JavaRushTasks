package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double n = Double.parseDouble(s);
        Svetofor(n);
    }

    public static double Svetofor(double time) {
        time = time % 60;
        time = time % 5;
        if (time >= 0 && time < 3) {
            System.out.println("зелёный");
        } else if (time >= 3 && time < 4) {
            System.out.println("желтый");
        } else if (time >= 4 && time < 5) {
            System.out.println("красный");
        }
        return time;
    }
}