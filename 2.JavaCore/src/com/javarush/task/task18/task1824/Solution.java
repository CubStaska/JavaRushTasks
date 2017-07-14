package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file;
        FileInputStream fileopen = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while ((file = reader.readLine()) != null) {
            try {
                fileopen = new FileInputStream(file);
                fileopen.close();
            } catch (FileNotFoundException e) {
                System.out.println(file);
                return;
            }
        }
    }
}
