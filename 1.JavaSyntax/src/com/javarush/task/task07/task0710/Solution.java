package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> spisok = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            spisok.add(0,reader.nextLine());
        }
        for (String sp: spisok) {
            System.out.println(sp);
        }
    }
}
