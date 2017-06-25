package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        int input;
        int result = 0;
        int count=0;
        Scanner read = new Scanner(System.in);
        while (read.hasNext()){
            count++;
            input = read.nextInt();

            if(input != -1){
                result += input;
            }else if (result == 0){
                System.out.println((double) result);
                break;
            }else {

                System.out.println((double) result/(count-1));
                break;
            }

        }

    }
}

