package com.javarush.task.task07.task0702;

import java.util.Scanner;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String [] mass = new String[10];
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            mass[i]= read.nextLine();
        }

        for (int i = mass.length-1; i >= 0 ; i--) {
            System.out.println(mass[i]);
        }
    }
}