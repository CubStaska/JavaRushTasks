package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        String name;
        int a;
        int b;
        Scanner read  = new Scanner(System.in);
        name = read.next();
        a = read.nextInt();
        b = read.nextInt();
        System.out.println(name +  " получает " + a + " через " + b + " лет.");
    }
}
