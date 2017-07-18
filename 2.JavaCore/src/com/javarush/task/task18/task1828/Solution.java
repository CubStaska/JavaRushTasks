package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String id;
        String productName = null;
        String price = null;
        String quantity = null;
        String tmp;
        boolean replase = false;
        if ("-d".equals(args[0])) {
            id = args[1];
        } else if ("-u".equals(args[0])) {
            id = args[1];
            productName = args[2];
            price = args[3];
            quantity = args[4];
            replase = true;
        } else {
            return;
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        fileName = reader.readLine();

        BufferedReader readerF = new BufferedReader(new FileReader(fileName));
        ArrayList<String> list = new ArrayList<>();
        while (readerF.ready()) {
            list.add(readerF.readLine());
        }
        BufferedWriter writerF = new BufferedWriter(new FileWriter(fileName));
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            int k = s.indexOf(" ");
            if (k > 8)
                tmp = s.substring(0, 8);

            else
                tmp = s.substring(0, k);
            if (Long.parseLong(tmp) != Long.parseLong(id)) {
                writerF.write(s);
                if (i != (list.size() - 1))
                    writerF.write("\n");
            } else {
                if (replase) {
                    tmp = String.format("%-8s%-30.30s%-8s%-4s", id, productName, price, quantity);
                    writerF.write(tmp.toString());
                    if (i != (list.size() - 1))
                        writerF.write("\n");
                }
            }
        }
        reader.close();
        readerF.close();
        writerF.close();
    }
}