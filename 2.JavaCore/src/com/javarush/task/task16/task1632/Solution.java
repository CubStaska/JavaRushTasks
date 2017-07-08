package com.javarush.task.task16.task1632;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
static {
    threads.add(new Thread1());
    threads.add(new Thread2());
    threads.add(new Thread3());
    threads.add(new Thread4());
    threads.add(new Thread5());
}
    public static void main(String[] args) {
        threads.get(4).start();
    }

    private static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true){

            }
        }
    }

    private static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                while (!isInterrupted()){

                }
                throw new InterruptedException();
            }catch (InterruptedException e){
                System.out.println("InterruptedException");
            }

        }
    }

    private static class Thread3 extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()){
                try {

                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    private static class Thread4 extends Thread implements Message {
        @Override
        public void showWarning() {
            while (!isAlive()){
                return;
            }
        }
    }

    private static class Thread5 extends Thread {

            String data;
            int count = 0;
        public void run()
        {
            Scanner scn = new Scanner(System.in);

            while (!(data = scn.nextLine()).equals("N"))
            {
                count += Integer.parseInt(data);
            }

            System.out.println(count);
        }

    }
}