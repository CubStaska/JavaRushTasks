package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();

        if (((a + b) > c) & ((a + c) > b) & ((b + c) > a)){
            System.out.println("Треугольник существует.");
        }else {
            System.out.println("Треугольник не существует.");
        }
    }
}