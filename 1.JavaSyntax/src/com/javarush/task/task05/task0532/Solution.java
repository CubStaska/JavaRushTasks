package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int readN = Integer.parseInt(reader.readLine());
        int [] console = new int[readN];
        if (readN > 0) {
            for (int i = 0; i < readN; i++) {
                console[i] = Integer.parseInt(reader.readLine());

            }
            Arrays.sort(console);
        }

        int maximum=console[console.length-1];

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
