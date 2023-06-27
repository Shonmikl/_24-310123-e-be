package org.example._2023_06_27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Debug {
    static Map<En, List<String>> map = new HashMap<>();
    static List<String > l1 = new ArrayList<>();
    static List<String > l2 = new ArrayList<>();

    public static void main(String[] args) {
        map.put(En.A, l1);
        map.put(En.B, l2);

        List<Integer> list = new ArrayList<>();
        if(list.isEmpty()) {

        }
    }
}

enum En {
    A,
    B,
}

