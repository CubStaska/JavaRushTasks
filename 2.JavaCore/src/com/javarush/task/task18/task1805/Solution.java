package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {


    public static void main(String[] args) throws Exception {
        String filename;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        filename = reader.readLine();
        FileInputStream openfile = new FileInputStream(filename);
        Set<Integer> sets = new TreeSet<>();
        while (openfile.available() > 0){
            sets.add(openfile.read());
        }
        openfile.close();
        for (Integer set:sets) {
            System.out.print(set + " ");
        }
    }
}
