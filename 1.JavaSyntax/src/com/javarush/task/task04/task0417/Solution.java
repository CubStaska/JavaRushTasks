package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();

        if (a == b && a==c) {
            System.out.println(a + " " + b + " " + c);
        }else if (a == b) {
            System.out.println(a + " " + b);
        }else if (b == c) {
            System.out.println(b + " " + c);
        }else if (a == c){
            System.out.println(a + " " + c);
        }
    }
}