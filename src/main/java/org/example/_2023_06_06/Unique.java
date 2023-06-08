package org.example._2023_06_06;

public class Unique {

    private static int getUnique(int[] array) {
        int xor = 0;
        for (int x : array) { // 2 3 5 3 2
            xor ^=x; // xor = xor ^ x;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 10, 20, 10, 10};
        System.out.println(getUnique(arr));
        int a = 0;
        int a1 = 8;
        System.out.println(19 ^ 3);
    }
}
