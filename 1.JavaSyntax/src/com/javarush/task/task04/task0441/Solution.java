package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = new Scanner(System.in).nextInt();
        }
        Arrays.sort(nums);
        System.out.println(nums[1]);
    }
}
