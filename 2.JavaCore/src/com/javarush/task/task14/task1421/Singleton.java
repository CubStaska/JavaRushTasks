package com.javarush.task.task14.task1421;

/**
 * Created by stas on 03.07.17.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton() {
    }
}
