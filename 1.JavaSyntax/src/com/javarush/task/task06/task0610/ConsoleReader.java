package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner read = new Scanner(System.in);
        return read.nextLine();

    }

    public static int readInt() throws Exception {
        Scanner read = new Scanner(System.in);
        return read.nextInt();

    }

    public static double readDouble() throws Exception {
        Scanner read = new Scanner(System.in);
        return read.nextDouble();

    }

    public static boolean readBoolean() throws Exception {
        Scanner read = new Scanner(System.in);
        String data =read.nextLine();
        if ("true".contains(data)){
            return true;
        }
        if ("false".contains(data)){
            return false;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
