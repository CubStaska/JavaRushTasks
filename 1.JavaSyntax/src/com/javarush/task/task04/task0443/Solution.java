package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        int y = read.nextInt();
        int m = read.nextInt();
        int d = read.nextInt();

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился "+ d+"."+ m+"."+y);

    }
}
