package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mass = new int[15];
        int chet=0;
        int nechet=0;
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < mass.length; i++) {
            mass[i] = reader.nextInt();
        }

        for (int i = 0; i < mass.length; i++) {
            if (i%2 == 0){
                chet += mass[i];
            }else {
                nechet += mass[i];
            }
        }

        if (chet > nechet){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
