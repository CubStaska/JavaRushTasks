package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Integer,String> mon = new HashMap<>();
        mon.put(1,"January");
        mon.put(2,"February");
        mon.put(3,"March");
        mon.put(4,"April");
        mon.put(5,"May");
        mon.put(6,"June");
        mon.put(7,"Jule");
        mon.put(8,"August");
        mon.put(9,"September");
        mon.put(10,"October");
        mon.put(11,"November");
        mon.put(12,"December");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        for (Map.Entry<Integer,String> m: mon.entrySet()) {
            if (m.getValue().equals(month)){
                System.out.println(m.getValue() + " is " + m.getKey() + " month");
            }
        }

    }
}
