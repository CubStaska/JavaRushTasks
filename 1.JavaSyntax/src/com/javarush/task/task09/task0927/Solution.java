package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String,Cat> caty = new HashMap<>();
        caty.put("Барсик1", new Cat("Барсик1"));
        caty.put("Барсик2", new Cat("Барсик2"));
        caty.put("Барсик3", new Cat("Барсик3"));
        caty.put("Барсик4", new Cat("Барсик4"));
        caty.put("Барсик5", new Cat("Барсик5"));
        caty.put("Барсик6", new Cat("Барсик6"));
        caty.put("Барсик7", new Cat("Барсик7"));
        caty.put("Барсик8", new Cat("Барсик8"));
        caty.put("Барсик9", new Cat("Барсик9"));
        caty.put("Барсик10", new Cat("Барсик10"));
        return caty;

    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<>();
        for (Map.Entry<String,Cat> mcat: map.entrySet()) {
            cats.add(mcat.getValue());
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
