package com.javarush.task.task14.task1408;

/**
 * Created by stas on 02.07.17.
 */

public class RussianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

    }
}