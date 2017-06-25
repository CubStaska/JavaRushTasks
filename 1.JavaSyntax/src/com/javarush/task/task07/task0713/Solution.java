package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> divtree = new ArrayList<>();
        ArrayList<Integer> divtwo = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            list.add(reader.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                divtree.add(list.get(i));
            }

            if (list.get(i) % 2 == 0) {
                divtwo.add(list.get(i));
            }


            if (list.get(i) % 3 != 0 & list.get(i) % 2 != 0) {
                other.add(list.get(i));
            }
        }

        printList(divtree);
        printList(divtwo);
        printList(other);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
