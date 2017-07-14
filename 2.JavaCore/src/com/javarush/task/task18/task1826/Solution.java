package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
            FileInputStream fileName = new FileInputStream(args[1]);
            FileOutputStream fileOutputName = new FileOutputStream(args[2]);
            if (args[0].equals("-e")){
                while (fileName.available() > 0){
                    int data = fileName.read() + 1;
                    fileOutputName.write(data);
                }

            }
            if (args[0].equals("-d")){
                while (fileName.available() > 0){
                    int data = fileName.read() - 1;
                    fileOutputName.write(data);
                }
            }
            fileName.close();
            fileOutputName.close();

    }

}
