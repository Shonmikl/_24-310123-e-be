package org.example;

public class Test1 {
    void m1(){
        System.out.println(5);
    }

    static void m2() {
    }

    public static void main(String[] args) {
        m2();
        Test55555.m3();
        new Test1().m1();
    }
}

class Test55555 {
    static void m3() {
    }
}