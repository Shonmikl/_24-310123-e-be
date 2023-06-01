package org.example._2023_05_25;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Ex2 {

    public static int[] createRandomArray(int arrayLength, int arraysValueRange) {
        Random random = new Random();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(arraysValueRange);
        }
        return array;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

//    private Character getEx() {
//        //
//        return new ArrayIndexOutOfBoundsException();
//    }

    public static void main(String[] args) {
        int s1 = sum(5, 9);
        int a = sum(1,2);

        int b = sum(s1, a);
        System.out.println(Arrays.toString(createRandomArray(22, 55)));
    }
}
