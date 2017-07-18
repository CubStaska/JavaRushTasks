package com.javarush.task.task19.task1911;

/* 
Ридер обертка
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream pr = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream streem = new PrintStream(outputStream);
        System.setOut(streem);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(pr);
        System.out.println(result.toUpperCase());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
