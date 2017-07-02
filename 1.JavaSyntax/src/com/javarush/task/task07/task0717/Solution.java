package com.javarush.task.task07.task0717;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(read.nextLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (String res : result) {
            System.out.println(res);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            list.add(i,list.get(i));

        }
        return list;
    }
}
