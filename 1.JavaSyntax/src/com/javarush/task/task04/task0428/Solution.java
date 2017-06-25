package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int count = 0;
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        if(a > 0 ){
            count++;
        }
        if (b > 0){
            count++;
        }
        if (c > 0){
            count++;
        }
        System.out.println(count);
    }
}
