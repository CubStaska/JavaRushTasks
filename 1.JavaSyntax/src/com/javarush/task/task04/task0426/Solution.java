package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        if (a != 0) {
            if (a < 0) {
                if (a % 2 == 0) {
                    System.out.println("отрицательное четное число");
                } else {
                    System.out.println("отрицательное нечетное число");
                }
            } else if (a % 2 == 0) {
                System.out.println("положительное четное число");
            } else {
                System.out.println("положительное нечетное число");
            }
        } else {
            System.out.println("ноль");
        }
    }
}
