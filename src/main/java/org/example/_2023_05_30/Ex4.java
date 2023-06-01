package org.example._2023_05_30;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(13);
        //4--6--9--13
//        int[] a = new int[10];
        list.add(5);
        list.add(15);
        list.add(52);
        list.add(35);
        list.add(325);
        list.add(345);
        list.add(55);
        list.add(6);
        list.add(75);
        list.add(775);
        list.add(98);
        list.add(918);
        list.add(9328);

        System.out.println(list.contains(908));

     //   System.out.println(list);
    }
}