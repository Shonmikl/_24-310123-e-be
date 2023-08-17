package org.example._2023_08_17;

public class MTEX9 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new M121());
        Thread t2 = new Thread(new M122());

        System.out.println(t1.getState());
        System.out.println(t2.getState());

        t1.start();
        t2.start();

        System.out.println(t1.getState());
        System.out.println(t2.getState());

        t1.join();
        t2.join();

        System.out.println(t1.getState());
        System.out.println(t2.getState());

        System.out.println("MAIN END");

        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }
}

class M121 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("UP: " + i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class M122 implements Runnable {

    @Override
    public void run() {
        for (int i = 20; i > 0; i--) {
            System.out.println("DOWN: " + i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}