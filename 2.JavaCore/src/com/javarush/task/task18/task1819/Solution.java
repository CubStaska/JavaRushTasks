package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream readfile1 = new FileInputStream(file1);
        FileInputStream readfile2 = new FileInputStream(file2);
        ArrayList<Integer> readfileone = new ArrayList<>();
        while (readfile1.available() > 0){
            readfileone.add(readfile1.read());
        }

        FileWriter writefile1 = new FileWriter(file1);
        while (readfile2.available() > 0){
            writefile1.write(readfile2.read());
        }
        writefile1.flush();
        for (int i = 0; i < readfileone.size(); i++) {
            writefile1.write(readfileone.get(i));
        }
        writefile1.close();
        readfile1.close();
        readfile2.close();
    }
}
