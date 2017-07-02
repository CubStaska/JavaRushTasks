package com.javarush.task.task07.task0703;

import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String massstring[] = new String[10];
        int massint[] = new int[10];
        Scanner read =new Scanner(System.in);

        for (int i = 0; i < massint.length; i++) {
            massstring[i] = read.nextLine();

        }

        for (int i = 0; i < massint.length; i++) {
            massint[i] = massstring[i].length();
            System.out.println(massint[i]);
        }
    }
}
