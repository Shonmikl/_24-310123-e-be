package org.example;

public class Test1 {
    private static int get(int a, int b) { // a2 b4
        return 450;
    }

    private static int get2(int a, int b) {
        if (a == 100) throw new IllegalArgumentException();
        return a * 10 + b;
    }

    public static void main(String[] args) {
        int a = get(40, 50);
    }

}