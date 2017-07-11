package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream1 = new FileOutputStream(file2);
        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
        int sizepart1;
        int sizepart2;
        byte [] buffpart1;
        byte [] buffpart2;
        int count;
        if (fileInputStream.available() > 0){
            System.out.println(fileInputStream.available()%2);
            if (fileInputStream.available() % 2 != 0) {
                sizepart1 = fileInputStream.available() / 2 + 1;
                sizepart2 = fileInputStream.available() - sizepart1;
                buffpart1 = new byte[sizepart1];
                buffpart2 = new byte[sizepart2];
            }else {
                sizepart1 = fileInputStream.available() / 2;
                sizepart2 = fileInputStream.available() - sizepart1;
                buffpart1 = new byte[sizepart1];
                buffpart2 = new byte[sizepart2];
            }

            count = fileInputStream.read(buffpart1);
            fileOutputStream1.write(buffpart1,0,count);
            count = fileInputStream.read(buffpart2);
            fileOutputStream2.write(buffpart2,0,count);
        }
        fileInputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();
    }
}