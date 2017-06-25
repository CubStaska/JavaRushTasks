package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        int d = read.nextInt();

        int max1 = max(a,b);
        int max2 = max(c,d);

        System.out.println(max(max1,max2));

    }

    private static int max(int a, int b)
    {
        if (a > b) return a;
        else return b;
    }
}
