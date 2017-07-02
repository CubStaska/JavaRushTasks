package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter write = new BufferedWriter(new FileWriter(reader.readLine()));
        String data;
        while (true){
            data = reader.readLine();
            write.write(data);
            write.newLine();
            if ("exit".equals(data)){
                break;
            }
        }
        write.newLine();
        write.close();

    }
}
