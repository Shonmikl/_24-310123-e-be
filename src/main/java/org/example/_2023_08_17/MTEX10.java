package org.example._2023_08_17;

public class MTEX10 extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
       long counter = 0;
       while (b) {
           counter++;
       }
        System.out.println("COUNTER: " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        MTEX10 mtex10 = new MTEX10();
        mtex10.start();
        Thread.sleep(1500);
        System.out.println("WAKE UP");
        mtex10.b = false;
        mtex10.join();
        System.out.println("END!");
    }
}