package com.javarush.task.task08.task0822;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min;
        min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (min > array.get(i)){
                min = array.get(i);
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        int strokenumber;
        Scanner reader = new Scanner(System.in);
        strokenumber = reader.nextInt();

        for (int i = 0; i < strokenumber; i++) {
            list.add(reader.nextInt());
        }

        return list;
    }
}
