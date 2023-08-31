package org.example._2023_08_31;

import java.util.concurrent.Semaphore;

public class SE {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        new Person("Anna", semaphore);
        new Person("Nam", semaphore);
        new Person("Egor", semaphore);
        new Person("Said", semaphore);
        new Person("Matiss", semaphore);
    }
}

class Person extends Thread {
    String name;
    private final Semaphore semaphore;

    public Person(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        this.setName("T: " + name);
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " before");
            semaphore.acquire();
            Thread.sleep(888);
            System.out.println(Thread.currentThread().getName() + " after");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
            System.out.println(Thread.currentThread().getName() + " out");
        }
    }
}