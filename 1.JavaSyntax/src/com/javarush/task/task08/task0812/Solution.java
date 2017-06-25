package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {


    public static void main(String[] args) throws IOException {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        int count=0;
        int max=0;
        for (int i = 0; i < 10; i++) {
            list.add(reader.nextInt());
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) == list.get(i)) {
                count++;
            }else {
                count=0;
            }

            if (max < count){
                max = count;
            }
        }
        System.out.println(max+1);

    }
}