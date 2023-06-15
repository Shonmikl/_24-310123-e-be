package org.example._2023_06_15;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        String key = "key"; //KEY
        Integer value = 10;

        map.put(key, value);
        System.out.println("Value associated with key: " + map.get(key));

        key = key.toUpperCase();

        System.out.println("Value associated with changed key: " + map.get(key));
    }
}