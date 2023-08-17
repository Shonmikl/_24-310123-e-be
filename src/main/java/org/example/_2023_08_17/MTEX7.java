package org.example._2023_08_17;

public class MTEX7 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MTEX7());
        t1.run();
        System.out.println(Thread.currentThread().getName() + "!!");
    }
}