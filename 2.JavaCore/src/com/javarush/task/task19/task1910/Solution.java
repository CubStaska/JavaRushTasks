package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        BufferedReader fileread = new BufferedReader(new FileReader(file1));
        BufferedWriter write = new BufferedWriter(new FileWriter(file2));
        while (fileread.ready()) {
            write.write(fileread.readLine().replaceAll("(?U)[\\pP\\s]", ""));
        }
        reader.close();
        fileread.close();
        write.close();
    }

}

