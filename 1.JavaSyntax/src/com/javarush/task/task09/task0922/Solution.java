package com.javarush.task.task09.task0922;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        String dateread = reader.nextLine();
        Date date = new Date(dateread);
        SimpleDateFormat format = new SimpleDateFormat("MMM dd, YYYY",Locale.US);
        System.out.println(format.format(date).toUpperCase());
    }
}
