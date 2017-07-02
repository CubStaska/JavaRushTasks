package com.javarush.task.task09.task0923;

import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        String readline = reader.nextLine();
        String glas="", soglas="";
        for (int i = 0; i < readline.length(); i++) {
            if (readline.charAt(i) !=32) {
                if (isVowel(readline.charAt(i))) {
                    glas += String.valueOf(readline.charAt(i)) + " ";
                } else {
                    soglas += String.valueOf(readline.charAt(i)) + " ";
                }
            }
        }
        System.out.println(glas);
        System.out.println(soglas);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}