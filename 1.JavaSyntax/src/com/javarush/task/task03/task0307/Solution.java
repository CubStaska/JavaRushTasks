package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
       Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        Zerg zerg10 = new Zerg();
        zerg1.name = "1";
        zerg2.name = "2";
        zerg3.name = "3";
        zerg4.name = "4";
        zerg5.name = "5";
        zerg6.name = "6";
        zerg7.name = "7";
        zerg8.name = "8";
        zerg9.name = "9";
        zerg10.name = "10";

        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();
        Protoss protoss4 = new Protoss();
        Protoss protoss5 = new Protoss();
        protoss1.name = "1";
        protoss2.name = "2";
        protoss3.name = "3";
        protoss4.name = "4";
        protoss5.name = "5";


        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();
        terran1.name="1";
        terran2.name="2";
        terran3.name="3";
        terran4.name="4";
        terran5.name="5";
        terran6.name="6";
        terran7.name="7";
        terran8.name="8";
        terran9.name="9";
        terran10.name="10";
        terran11.name="11";
        terran12.name="12";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
