package com.javarush.task.task14.task1408;

/**
 * Created by stas on 02.07.17.
 */
public class BelarusianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 40;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

    }
}