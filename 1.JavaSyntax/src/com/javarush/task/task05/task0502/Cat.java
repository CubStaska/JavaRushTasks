package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        if (anotherCat.strength > this.strength){
            return true;
        }
        if (anotherCat.weight > this.weight){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.name = "Vaska";
        cat2.name = "Semen";
        cat1.weight = 3;
        cat2.weight = 4;
        cat1.strength = 3;
        cat2.strength = 2;
        cat1.age = 3;
        cat2.age = 2;

        cat1.fight(cat2);
    }
}
