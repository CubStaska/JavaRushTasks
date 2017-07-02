package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int res=0;
        int ret=0;
        while (read.hasNext()){
            res = read.nextInt();
            if (res != -1) {
                ret += res;
            }else {
                ret += res;
                break;
            }
        }
        System.out.println(ret);
    }
}
