package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        String s = read.next();
        int a = read.nextInt();
        int i=0;
        while (i < a){
            System.out.println(s);
            i++;
        }

    }
}
