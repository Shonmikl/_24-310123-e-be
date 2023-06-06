package org.example._2023_06_06;

public class Unique {

    private static int getUnique(int[] array) {
        int xor = 0;
        for (int x : array) {
            xor ^=x;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 33, 10, 20, 99, 33};
        System.out.println(getUnique(arr));
        int a = 0;
        int a1 = 8;
    }
}
