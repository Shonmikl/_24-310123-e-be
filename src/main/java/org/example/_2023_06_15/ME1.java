package org.example._2023_06_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ME1 {
    public static void main(String[] args) {
        Map<Integer, String> periodMap = new HashMap<>();
        periodMap.put(1, "!!!"); //8
        periodMap.put(2, "@@@");
        periodMap.put(3, "###");
        periodMap.put(4, "$$$");
        periodMap.put(5, "^^^");
        periodMap.putIfAbsent(1, "RRR");

        System.out.println(periodMap);
        List<Integer> list = new ArrayList<>();

        for (Integer s : periodMap.keySet()) {
            list.add(s);
        }


//        for (Map.Entry<Integer, String> s : periodMap.entrySet()) {
//
//        }
    }
}
