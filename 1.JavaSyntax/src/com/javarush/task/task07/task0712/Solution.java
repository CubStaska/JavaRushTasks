package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {


    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> spisok = new ArrayList<>();
        int min=0;
        int max=0;
        int maxindex=0;
        int minindex=0;

        for (int i = 0; i < 10; i++) {
            spisok.add(reader.nextLine());
        }

        min = spisok.get(0).length();

        for (int i = 0; i < spisok.size(); i++) {
            if (max < spisok.get(i).length()){
                max = spisok.get(i).length();
                maxindex = i;
            }

            if (min > spisok.get(i).length()){
                min = spisok.get(i).length();
                minindex = i;
            }
        }

        if (maxindex <  minindex){
            System.out.println(spisok.get(maxindex));
        }else {
            System.out.println(spisok.get(minindex));
        }

    }
}
