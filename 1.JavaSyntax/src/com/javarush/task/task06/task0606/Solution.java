package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;
    private static char[] data;


    public static void main(String[] args) throws IOException {

        Scanner read = new Scanner(System.in);
        data = read.nextLine().toCharArray();

        for (int i = 0; i < data.length; i++) {
            if (data[i]%2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Even: "+ even +" Odd: "+odd);
    }
}
