package com.javarush.task.task07.task0711;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> spisok = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            spisok.add(reader.nextLine());
        }
        for (int i = 0; i < 13; i++) {
            spisok.add(0, spisok.remove(spisok.size()-1));
        }

        for (String sp: spisok) {
            System.out.println(sp);
        }
    }
}
