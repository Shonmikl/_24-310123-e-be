package org.example._2023_08_31;

import java.util.concurrent.CountDownLatch;

public class CDL {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void prepareSystem() throws InterruptedException {
        Thread.sleep(666);
        countDownLatch.countDown();
        System.out.println("[System was prepared] [COUNTER: " + countDownLatch.getCount() + "]");
    }

    private static void writeLog() throws InterruptedException {
        Thread.sleep(999);
        countDownLatch.countDown();
        System.out.println("[Log file was wrote] [COUNTER: " + countDownLatch.getCount() + "]");
    }

    private static void startSystem() throws InterruptedException {
        Thread.sleep(1111);
        countDownLatch.countDown();
        System.out.println("[System is starting.......] [COUNTER: " + countDownLatch.getCount() + "]");
    }

    public static void main(String[] args) {
        new Systems("SYSTEM_W", countDownLatch);
        new Systems("SYSTEM_T", countDownLatch);
        new Systems("SYSTEM_J", countDownLatch);
        new Systems("SYSTEM_L", countDownLatch);
        new Systems("SYSTEM_B", countDownLatch);
        new Systems("SYSTEM_O", countDownLatch);

        try {
            prepareSystem();
            writeLog();
            startSystem();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Systems extends Thread {
    String typeSyst;
    private CountDownLatch countDownLatch;

    public Systems(String typeSyst, CountDownLatch countDownLatch) {
        this.typeSyst = typeSyst;
        this.countDownLatch = countDownLatch;
        this.setName("T---> " + typeSyst);
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(typeSyst + "[working....]" + " : THREAD: " + Thread.currentThread().getName() );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}