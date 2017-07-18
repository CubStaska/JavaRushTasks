package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        BufferedReader fileread = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
        while (fileread.ready()) {
            String data = fileread.readLine();
            String[] res = data.split(" ");
            for (String s : res) {
                try {
                    int i = Integer.parseInt(s);
                    writer.write(String.valueOf(i) + " ");
                } catch (NumberFormatException e) {

                }


            }
        }
        writer.close();
        fileread.close();
        reader.close();
    }
}
