package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int your = read.nextInt();
        if (your%4 !=0 || your%100==0 && your%400 !=0){
            System.out.println("количество дней в году: 365");
        }else {
            System.out.println("количество дней в году: 366");
        }

    }
}