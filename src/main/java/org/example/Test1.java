package org.example;

import org.example._2023_06_08.POJO;

import java.util.Arrays;

public class Test1 {
    private void getArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 15) {
                System.out.println("!!!");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 1, 2, 7};


        for (int i = 0; i < 10; i++) {

        }
//             TYPE x = new 5(constructor)
        POJO pojo = new POJO("II", 11);
        pojo.setSalary(9999999);
        new POJO("WS", 654d).setSalary(123);

    }

}