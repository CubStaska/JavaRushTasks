package com.javarush.task.task01.task0107;

/* 
Комментарии излишни
*/

public class Solution {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

       // x = x * 3; //x = 6
        y = x + y; //y = 18
        x = y - x; // x = 12
        y = y - x; //y = 6;

        System.out.println(x);
        System.out.println(y);
    }
}
