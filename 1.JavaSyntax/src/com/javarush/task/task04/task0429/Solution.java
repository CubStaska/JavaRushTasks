package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    static int minus = 0;
    static int plus = 0;

    public static void main(String[] args) throws Exception {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(console.readLine());
        int b = Integer.parseInt(console.readLine());
        int c = Integer.parseInt(console.readLine());
        int z = 0;
        int x = 0;
        if (a != 0) if (a > 0) z++;
        else x++;
        if (b != 0) if (b > 0) z++;
        else x++;
        if (c != 0) if (c > 0) z++;
        else x++;
        System.out.println("количество положительных чисел: " + z);
        System.out.println("количество отрицательных чисел: " + x);
    }
}
