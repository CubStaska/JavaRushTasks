package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> spisok = new ArrayList<>();
        spisok.add("strok1");
        spisok.add("strok2");
        spisok.add("strok3");
        spisok.add("strok4");
        spisok.add("strok5");
        System.out.println(spisok.size());

        for (String sp: spisok) {
            System.out.println(sp);
        }
    }
}
