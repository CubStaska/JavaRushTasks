package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {


    public static void main(String[] args) throws IOException {
        int data;
        int count=0;
        String filename = args[0];
        FileInputStream fileInputStream = new FileInputStream(filename);
        ArrayList<Integer> smallAlphabet = new ArrayList<>();
        ArrayList<Integer> bigAlphabet = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++){
            smallAlphabet.add(i);
        }
        for (int i = 'A'; i <= 'Z'; i++){
            bigAlphabet.add(i);
        }
        while (fileInputStream.available() > 0){
            data = fileInputStream.read();
            for (int i = 0; i < smallAlphabet.size(); i++) {
                if (smallAlphabet.get(i) == data){
                    count++;
                }
                if (bigAlphabet.get(i) == data){
                    count++;
                }
            }

        }
        System.out.println(count);
        fileInputStream.close();
    }
}
