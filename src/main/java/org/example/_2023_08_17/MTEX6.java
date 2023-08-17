package org.example._2023_08_17;

public class MTEX6 {
    public static void main(String[] args) {
        Thread T1 = new Thread(new MTR());
        Thread T2 = new Thread(new MTR());
        Thread T3 = new Thread(new MTR());
        Thread T4 = new Thread(new MTR());

        T1.setName("T1");
        T2.setName("T2");
        T3.setName("T3");
        T4.setName("T4");

        T1.start();
        T2.start();
        T3.start();
        T4.start();
    }
}

class MTR implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("THREAD NAME: " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + "**" + i);
        }
    }
}