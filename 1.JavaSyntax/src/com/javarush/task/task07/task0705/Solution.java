package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int[] bigmass = new int[20];
        int[] smallmass1 = new int[10];
        int[] smallmass2 = new int[10];
        for (int i = 0; i < bigmass.length; i++) {
            bigmass[i] = reader.nextInt();
        }

        for (int i = 0; i < smallmass1.length; i++) {
            smallmass1[i] = bigmass[i];
        }

        for (int i = 0; i < smallmass2.length; i++) {
            smallmass2[i] = bigmass[i+10];
        }

        for (int i = 0; i < smallmass2.length; i++) {
            System.out.println(smallmass2[i]);
        }
    }
}
