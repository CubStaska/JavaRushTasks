package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        int count = 1;
        FileReader readerfile = new FileReader(file1);
        FileWriter fileWriter = new FileWriter(file2);
        int data;
        while ((data = readerfile.read()) != -1) {
            if (count % 2 == 0) {
                fileWriter.write(data);
            }
            count++;
        }
        reader.close();
        readerfile.close();
        fileWriter.close();
    }
}
