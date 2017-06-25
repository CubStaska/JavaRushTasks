package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> spisok = new ArrayList<>();
        int max = 0;
        String outstring = "";

        for (int i = 0; i < 5; i++) {
            spisok.add(reader.nextLine());
        }


        for (int i = 0; i < spisok.size(); i++) {
            if (max < spisok.get(i).length()) {
                max = spisok.get(i).length();
            }
        }


        for (int i = 0; i < spisok.size(); i++) {
            if (max == spisok.get(i).length()) {
                outstring += spisok.get(i) + "\n";
            }
        }
        System.out.println(outstring);
    }

}
