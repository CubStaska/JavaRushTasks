package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> setlist = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            setlist.add(i);
        }
        return setlist;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator<Integer> iteratorIterator = set.iterator();

        while (iteratorIterator.hasNext()){
            if (iteratorIterator.next() > 10){
                iteratorIterator.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
