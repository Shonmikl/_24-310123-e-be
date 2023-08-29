package org.example._2023_08_29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TTPP {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN START");
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 11; i++) {
            executorService.execute(new U2());
        }

        executorService.shutdown();
        executorService.awaitTermination(40, TimeUnit.SECONDS);
        System.out.println("MAIN END");
    }
}

class U2 extends Thread {

    @Override
    public void run() {
        System.out.println("START: " + Thread.currentThread().getName());
        for (int i = '!'; i < '*'; i++) {
            try {
                System.out.println("CHAR: " + (char) i + " : " + Thread.currentThread().getName());
                Thread.sleep(222);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("END: " + Thread.currentThread().getName());
    }
}