package com.javarush.task.task07.task0704;

import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int massint[] = new int[10];
        Scanner read =new Scanner(System.in);

        for (int i = massint.length-1; i >= 0; i--) {
            massint[i] = read.nextInt();

        }
        for (int i = 0; i < massint.length; i++) {
            System.out.println(massint[i]);
        }
    }
}

