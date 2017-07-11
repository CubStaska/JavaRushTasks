package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream readfil2 = new FileInputStream(file2);
        FileWriter fileWriter1 = new FileWriter(file1,true);
        FileInputStream readfile3 = new FileInputStream(file3);
        while (readfil2.available() > 0){
            fileWriter1.write(readfil2.read());
        }
        while (readfile3.available() > 0){
            fileWriter1.write(readfile3.read());
        }

        readfil2.close();
        fileWriter1.close();
        readfile3.close();
    }
}
