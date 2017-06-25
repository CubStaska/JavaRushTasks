package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();

        int[] sort = {a,b,c};
        Arrays.sort(sort);
        for (int i = sort.length-1; i >= 0; i--) {
            System.out.print(sort[i]+" ");
        }

    }



}
