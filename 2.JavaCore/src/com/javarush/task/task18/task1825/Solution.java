package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listfile = new ArrayList<>();
        while ((file = reader.readLine()) != null) {
            if (file.equals("end")) {
                break;
            }
            listfile.add(file);
        }
        Collections.sort(listfile, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        String outFileName = listfile.get(0).split(".part")[0];
        FileOutputStream filewrite = new FileOutputStream(outFileName);
        System.out.println(outFileName);
        for (String filepart : listfile) {
            FileInputStream fopen = new FileInputStream(filepart);
            byte[] buff = new byte[fopen.available()];
            fopen.read(buff);
            filewrite.write(buff);
            fopen.close();
        }
        filewrite.close();
    }
}
