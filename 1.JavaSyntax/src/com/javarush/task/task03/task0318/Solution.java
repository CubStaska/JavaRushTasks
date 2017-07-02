package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String name;
        int age;
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       age = Integer.parseInt(reader.readLine());
        name = reader.readLine();
        System.out.println(name + " "+"захватит мир через " + age + " лет. Му-ха-ха!");
    }
}
