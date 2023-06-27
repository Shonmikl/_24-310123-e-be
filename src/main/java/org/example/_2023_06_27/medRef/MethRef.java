package org.example._2023_06_27.medRef;

public class MethRef {
    public static void main(String[] args) {
        m2(MethRef::all);
    }

    public static void r2() {
        System.out.println("@@@@");
        System.out.println("++++");
    }

    public static void r3() {
        System.out.println("QQQQQQQQ");
        System.out.println("EEEEEEE");
    }

    public static void all() {
        r2();
        r3();
    }

    public static void m2(Met met) {
        met.wwwwwww();
    }
}

@FunctionalInterface
interface Met {
    void wwwwwww();
}