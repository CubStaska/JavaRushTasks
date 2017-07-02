package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));


        while (file.ready()){
            System.out.println(file.readLine());
        }


        reader.close();
        file.close();

    }
}