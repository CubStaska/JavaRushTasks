package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        String name1 = reader.next();
        String name2 = reader.next();

        if (name1.contains(name2)){
            System.out.println("Имена идентичны");
        }else if (name1.length() == name2.length()){
            System.out.println("Длины имен равны");
        }

    }
}
