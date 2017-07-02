package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {



    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerFile = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        ArrayList<Integer> list = new ArrayList<>();
        Integer data;
        while (readerFile.ready()){
            data = Integer.valueOf(readerFile.readLine());
            if ((data % 2) == 0){
                list.add(data);
            }
        }

        Collections.sort(list);
        for (Integer l: list) {
            System.out.println(l);
        }

        readerFile.close();
    }
}
