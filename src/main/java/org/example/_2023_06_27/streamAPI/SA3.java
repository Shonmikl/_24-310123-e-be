package org.example._2023_06_27.streamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class SA3 {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 23, 4, 59, 8, 56);

        Object[] s = integerStream
                .filter(el -> el % 2 == 0)
                .sorted()
                .distinct()
                .map(el -> el * 10)
                .toArray();

        System.out.println(Arrays.toString(s));
    }
}
