package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String[] array = new String[0];
        BufferedReader readfile = new BufferedReader(new FileReader(file1));
        FileWriter writefile = new FileWriter(file2);
        if (readfile.ready()){
           array = readfile.readLine().split(" ");
        }

        for (String a: array) {
            writefile.write(String.valueOf(Math.round(Double.valueOf(a)))+ " ");
        }

        readfile.close();
        writefile.close();
    }
}
