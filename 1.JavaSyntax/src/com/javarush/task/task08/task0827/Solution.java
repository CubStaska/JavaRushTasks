package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date dDate = new Date(date);
        SimpleDateFormat format = new SimpleDateFormat("D");
        int dayInTheYear = Integer.parseInt(format.format(dDate));
        if (dayInTheYear % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
