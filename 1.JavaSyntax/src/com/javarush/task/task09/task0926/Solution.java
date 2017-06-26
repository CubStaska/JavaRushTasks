package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int [] mass1 = {2,4,3,5,3};
        int [] mass2 = {6,4};
        int [] mass3 = {6,3,9,0};
        int [] mass4 = {1,2,3,4,5,6,7};
        int [] mass5 = {};
        list.add(mass1);
        list.add(mass2);
        list.add(mass3);
        list.add(mass4);
        list.add(mass5);
        return list;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
