package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstname;
        private String lastname;
        private int age;
        private boolean sex;
        private int your;
        private int weigth;

        public Human(String lastname, boolean sex, int weigth) {
            this.lastname = lastname;
            this.sex = sex;
            this.weigth = weigth;
        }

        public Human(String lastname, boolean sex) {

            this.lastname = lastname;
            this.sex = sex;
        }

        public Human(String lastname, int age) {

            this.lastname = lastname;
            this.age = age;
        }

        public Human(String firstname, String lastname, boolean sex) {

            this.firstname = firstname;
            this.lastname = lastname;
            this.sex = sex;
        }

        public Human(String firstname, String lastname, int age, boolean sex, int your, int weigth) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
            this.sex = sex;
            this.your = your;
            this.weigth = weigth;
        }

        public Human(String firstname, String lastname, int age, boolean sex, int your) {

            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
            this.sex = sex;
            this.your = your;
        }

        public Human(String firstname, String lastname, int age, boolean sex) {

            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
            this.sex = sex;
        }

        public Human(String firstname, String lastname, int age) {

            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
        }

        public Human(String firstname, String lastname) {

            this.firstname = firstname;
            this.lastname = lastname;
        }

        public Human(String firstname) {

            this.firstname = firstname;
        }
    }
}
