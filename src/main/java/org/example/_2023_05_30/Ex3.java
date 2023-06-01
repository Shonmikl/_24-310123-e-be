package org.example._2023_05_30;

import java.util.Arrays;

public class Ex3 implements ChessPlayAble {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 5, 6, 5, 4, 2, 3, 5, 1};
        int[] unique = Arrays.stream(array).distinct().toArray();
        System.out.println(Arrays.toString(unique));
    }

    @Override
    public void play() {
        System.out.println(1200);
    }
}

interface ChessPlayAble {
    void play();
}

class C implements ChessPlayAble {
    @Override
    public void play() {
        System.out.println(2500);
    }
}
