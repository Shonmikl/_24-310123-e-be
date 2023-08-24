package org.example._2023_08_24.part2;

public class ME3 {
    //private static final Object LOCK = new Object();

    void mobCall() throws InterruptedException {
       // synchronized (LOCK) {
            synchronized (this) {
            System.out.println("Mob call start!");
            Thread.sleep(2200);
            System.out.println("Mob call end");
        }
    }

    void skypeCall() throws InterruptedException {
        //synchronized (LOCK) {
        synchronized (this) {
            System.out.println("Skype call start!");
            Thread.sleep(2800);
            System.out.println("Skype call end");
        }
    }

    void telCall() throws InterruptedException {
        //synchronized (LOCK) {
        synchronized (this) {
            System.out.println("Tel call start!");
            Thread.sleep(1500);
            System.out.println("Tel call end");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Mob());
        Thread t2 = new Thread(new Skype());
        Thread t3 = new Thread(new Tel());

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }
}

class Mob implements Runnable {

    @Override
    public void run() {
        try {
            new ME3().mobCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Skype implements Runnable {

    @Override
    public void run() {
        try {
            new ME3().skypeCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Tel implements Runnable {

    @Override
    public void run() {
        try {
            new ME3().telCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}