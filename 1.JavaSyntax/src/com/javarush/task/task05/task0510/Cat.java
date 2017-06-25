package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name = null;
    int age =3;
    int weight=2;
    String address=null;
    String color = "Black";


    public void initialize(String name){
        this.name = name;

    }
    public void initialize(String name,int weight,int age){
        this.name = name;
        this.weight = weight;
        this.age = age;

    }

    public void initialize(String name,int age){
        this.name = name;
        this.age = age;

    }
    public void initialize(int weight,String color){
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight,String color,String address){
        this.address = address;
        this.weight = weight;
        this.color = color;
    }


    public static void main(String[] args) {

    }
}
