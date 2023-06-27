package org.example._2023_06_27.medRef;

public class Lambda {
    public static void main(String[] args) {
        m1(() -> {
            System.out.println("@@@@");
            System.out.println("++++");
        });
    }

    public static void m1(Inter inter) {
        inter.get();
    }
}

@FunctionalInterface
interface Inter {
    void get();
}