package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cat catGrandpa = new Cat(reader.readLine());
        Cat catGrandma = new Cat(reader.readLine());
        Cat catFather = new Cat(reader.readLine(), null, catGrandpa);
        Cat catMother = new Cat(reader.readLine(), catGrandma, null);
        Cat catSon = new Cat(reader.readLine(), catMother, catFather);
        Cat catDaughter = new Cat(reader.readLine(), catMother, catFather);

        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private Cat mather;
        private Cat father;
        private String name;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mather , Cat father) {
            this.name = name;
            this.mather =  mather;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mather == null && father == null)
                return "Cat name is " + name + ", no mother , no father ";
            else if (mather == null){
                return "Cat name is " + name + ", no mother, father is " + father.name;
            } else if (father == null){
                return "Cat name is " + name + ", mother is " + mather.name + ", no father";
            }else {
                return "Cat name is " + name + ", mother is " + mather.name + ", father is " + father.name;
            }

        }
    }

}
