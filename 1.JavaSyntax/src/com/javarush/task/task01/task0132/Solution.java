package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int result=0;
        String str = Integer.toString(number);
        for (int i = 0; i < str.toCharArray().length; i++) {
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
            return result;
    }
}