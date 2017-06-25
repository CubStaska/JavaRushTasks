package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();

        if (a == b){
            System.out.println(a);
        }else if ( a < b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}