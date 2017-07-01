package com.javarush.task.task12.task1225;

/* 
Посетители
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {

        if (o instanceof Tiger && o instanceof Cat){
          return "Тигр";
      }
        if (o instanceof Lion && o instanceof Cat){
            return "Лев";
        }
        if (o instanceof Cat && o instanceof Animal){
            return "Кот";
        }
        if (o instanceof Bull && o instanceof Animal){
            return "Бык";
        }

        if (o instanceof Animal) {
            return "Животное";
        }
        return "";
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
