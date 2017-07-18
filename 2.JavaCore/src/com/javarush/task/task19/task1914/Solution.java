package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        String result = byteArrayOutputStream.toString();
        System.setOut(out);
        String[] param = result.split(" ");
        int res;
        switch (param[1]) {
            case "+":
                res = Integer.parseInt(param[0]) + Integer.parseInt(param[2]);
                System.out.println(param[0] + " " + param[1] + " " + param[2] + " " + param[3] + " " + res);
                break;
            case "*":
                res = Integer.parseInt(param[0]) * Integer.parseInt(param[2]);
                System.out.println(param[0] + " " + param[1] + " " + param[2] + " " + param[3] + " " + res);
                break;
            case "-":
                res = Integer.parseInt(param[0]) - Integer.parseInt(param[2]);
                System.out.println(param[0] + " " + param[1] + " " + param[2] + " " + param[3] + " " + res);
                break;

        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

