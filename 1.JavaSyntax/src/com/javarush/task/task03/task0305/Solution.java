package com.javarush.task.task03.task0305;

/* 
Я так давно родился
*/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2001,4,1);
        SimpleDateFormat dataFormat = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);
        System.out.println(dataFormat.format(calendar.getTime()).toUpperCase());
    }
}
