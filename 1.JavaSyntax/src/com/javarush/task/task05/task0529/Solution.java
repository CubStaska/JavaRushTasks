package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {


    public static void main(String[] args) throws Exception {
        Solution sl = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String data;
        int summ = 0;
        while ((data = reader.readLine()) != null){
            if ("сумма".equals(data) ){
                break;
            }
            summ += Integer.parseInt(data);
        }
        System.out.println(summ);

    }
}
