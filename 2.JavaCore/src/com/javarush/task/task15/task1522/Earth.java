package com.javarush.task.task15.task1522;

/**
 * Created by stas on 04.07.17.
 */
public class Earth implements Planet {
    private static Earth instance;

    public static Earth getInstance() {
        if (instance== null)
            instance = new Earth();
        return instance;
    }

    private Earth() {
    }
}
