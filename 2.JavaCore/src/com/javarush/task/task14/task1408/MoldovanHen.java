package com.javarush.task.task14.task1408;

/**
 * Created by stas on 02.07.17.
 */
public class MoldovanHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 15;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

    }
}