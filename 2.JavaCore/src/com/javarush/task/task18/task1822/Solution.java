package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (file.ready()) {
            String s = file.readLine();
            if (s.startsWith(args[0]))
                System.out.println(s);
        }
        file.close();
    }
}

