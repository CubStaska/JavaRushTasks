package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileread = reader.readLine();
        String filewrite = reader.readLine();
        FileInputStream filein = new FileInputStream(fileread);
        FileOutputStream fileout = new FileOutputStream(filewrite);
        ArrayList<Byte> list = new ArrayList<>();
        while (filein.available() > 0) {
           list.add((byte) filein.read());
        }

        for (int i = list.size() - 1; i >= 0; i--) {
           fileout.write(list.get(i).byteValue());
        }
        filein.close();
        fileout.close();
    }
}
