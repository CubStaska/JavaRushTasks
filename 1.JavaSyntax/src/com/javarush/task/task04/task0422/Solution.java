package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        String name = reader.next();
        int age = reader.nextInt();
        if (age < 18){
            System.out.println("Подрасти еще");
        }
    }
}
