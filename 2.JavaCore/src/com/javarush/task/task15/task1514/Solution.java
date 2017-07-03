package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(5.7,"adfs");
        labels.put(5.9,"adfseda");
        labels.put(3.7,"adfsdsad");
        labels.put(56.7,"adfsasdasd");
        labels.put(523.7,"adfsasdadsa");

    }
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
