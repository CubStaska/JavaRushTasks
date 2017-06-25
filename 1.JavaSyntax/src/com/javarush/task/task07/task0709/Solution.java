package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> spisok = new ArrayList<>();
        int min;
        String outstring = "";

        for (int i = 0; i < 5; i++) {
            spisok.add(reader.nextLine());
        }
        min = Integer.parseInt(spisok.get(0));

        for (int i = 0; i < spisok.size(); i++) {
            if (min > spisok.get(i).length()) {
                min = spisok.get(i).length();
            }
        }


        for (int i = 0; i < spisok.size(); i++) {
            if (min == spisok.get(i).length()) {
                outstring += spisok.get(i) + "\n";
            }
        }
        System.out.println(outstring);
    }
}
