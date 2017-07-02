package com.javarush.task.task07.task0718;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        int digist = 0;
        ArrayList<String> list = new ArrayList();
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(read.nextLine());
        }
        digist = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            if (digist > list.get(i).length()){
                System.out.println(i);
                break;
            }
            digist = list.get(i).length();
        }
    }
}

