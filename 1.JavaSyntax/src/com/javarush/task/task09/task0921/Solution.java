package com.javarush.task.task09.task0921;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> list = new ArrayList<>();;
        try {
            Scanner reader = new Scanner(System.in);
            while (reader.hasNext()) {
                list.add(reader.nextInt());
            }
        } catch (InputMismatchException e) {
            for (Integer i: list) {
                System.out.println(i);
            }
        }
    }
}
