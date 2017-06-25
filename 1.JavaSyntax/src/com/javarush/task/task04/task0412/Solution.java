package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();

        if ( a == 0){
            System.out.println(0);
        }

        if (a < 0){
            System.out.println(a+1);
        }
        if (a > 0){
            System.out.println(a*2);
        }
    }

}