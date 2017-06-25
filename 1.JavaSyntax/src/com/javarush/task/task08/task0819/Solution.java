package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        cats.remove(cats.iterator().next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cat = new HashSet<>();
        cat.add(new Cat());
        cat.add(new Cat());
        cat.add(new Cat());
        return cat;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    // step 1 - пункт 1

    public static class Cat {

    }
}
