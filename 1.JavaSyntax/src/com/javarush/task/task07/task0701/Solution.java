package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        Scanner read = new Scanner(System.in);
        int [] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = read.nextInt();
        }
        return array;
    }

    public static int max(int[] array) {
        int max=0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }

        return max;
    }
}
