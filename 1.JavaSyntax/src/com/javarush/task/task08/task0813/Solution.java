package com.javarush.task.task08.task0813;

import java.util.Arrays;
import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static HashSet<String> createSet() {
        String init[] = {"Лаваш",
                "Лавинатль",
                "Лавиния",
                "Лавис",
                "Лавка",
                "Лавочка",
                "Лавочник",
                "Лавр",
                "Лавра",
                "Лавразия",
                "Лаврак",
                "Лавреол",
                "Лаврецкий",
                "Лавровит",
                "Лавровишня",
                "Лавровые",
                "Лавсония",
                "Лаг",
                "Лагаш",
                "Лагер"
        };
        HashSet<String> list = new HashSet<String>();
        list.addAll(Arrays.asList(init));
        return list;
    }

    public static void main(String[] args) {

    }
}
