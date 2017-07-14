package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String filename = read.readLine();
        BufferedReader readfile = new BufferedReader(new FileReader(filename));
        FileWriter filewrite = null;
        String productName = args[1];
        String price = args[2];
        String quantity = args[3];
        String id = "";
        String str = "";
        ArrayList<String> pricelist = new ArrayList<>();
        while ((str = readfile.readLine()) != null) {
            pricelist.add(str);
            id = str.substring(0, 8);

        }
        readfile.close();

        String s = String.format(Locale.ENGLISH, "%-8d%-30.30s%-8.2f%-4s", (Integer.parseInt(id)) + 1, productName, Double.parseDouble(price), quantity.trim());

        if (args[0].equals("-c")) {
            pricelist.add(s);
            filewrite = new FileWriter(filename);
            for (String pr : pricelist) {
                filewrite.write(pr + "\n");
            }

        }
        filewrite.close();
    }
}
