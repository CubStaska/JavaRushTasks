package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        if (a == b) System.out.println("3");
        else if (a == c) System.out.println("2");
        else if (c == b) System.out.println("1");

    }
}
