package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human ded1 = new Human("Smit",true,65);
        Human ded2 = new Human("Женя",true,75);
        Human grandmother1 = new Human("Аня",false,55);
        Human grandmother2 = new Human("Лида",false,57);

        Human father = new Human("Федор",true,45,ded1,grandmother1);
        Human mother = new Human("Юля",false,43,ded2,grandmother1);

        Human children1 = new Human("Аня11",false,20,father,mother);
        Human children2 = new Human("Аня1",false,20,father,mother);
        Human children3 = new Human("Ceniy",true,20,father,mother);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















