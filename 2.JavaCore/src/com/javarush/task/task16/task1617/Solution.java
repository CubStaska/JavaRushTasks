package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
           while (countSeconds >= 1) {
                   System.out.print(countSeconds + " ");
                   countSeconds--;

               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   System.out.print("Прервано!");
                   return;
               }

           }
            System.out.print("Марш!");
        }
    }
}
