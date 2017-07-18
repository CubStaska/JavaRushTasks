package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] data = fileScanner.nextLine().split(" ");
            String fio = data[0];
            String name = data[1];
            String otchestvo = data[2];
            String day = data[3];
            String month = data[4];
            String your = data[5];
            return new Person(fio, name, otchestvo, new Date(day + " " + month + " " + your));
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
