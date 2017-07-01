package com.javarush.task.task12.task1205;

/* 
Определимся с животным
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Solution.Cow) {
            return o.toString();
        } else if (o instanceof Solution.Dog) {
            return o.toString();
        } else if (o instanceof Solution.Whale) {
            return o.toString();
        }
        return "Неизвестное животное";
    }

    public static class Cow {
        @Override
        public String toString() {
          return "Корова";
        }
    }

    public static class Dog {
        @Override
        public String toString() {
            return "Собака";
        }
    }

    public static class Whale {
        @Override
        public String toString() {
            return "Кит";
        }
    }

    public static class Pig {
    }
}
