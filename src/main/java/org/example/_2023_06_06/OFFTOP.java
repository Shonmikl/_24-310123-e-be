package org.example._2023_06_06;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class OFFTOP {
    private static Set<Integer> unique1(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int j : array) {
            set.add(j);
        }
        return set;
    }

//    private static Set<Integer> unique2(int[] array) {
//       Arrays.stream(array).distinct();
//    }

    public static void main(String[] args) {
        //[] 1 1  ---- set 1
    }
}
