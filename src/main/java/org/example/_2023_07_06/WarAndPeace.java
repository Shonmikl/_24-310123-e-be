package org.example._2023_07_06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WarAndPeace {
    public static void main(String[] args) throws IOException {
        String content = Files.readString(Paths.get("wp.txt"));
        List<String> words = Arrays.asList(content.split("\\P{L}+"));

        long count = words.stream().distinct().count();
        long countWithRepeat = words.size();

        System.out.println("Words count: " + countWithRepeat);
        System.out.println("Unique words: " + count);

        words.stream()
                .collect(Collectors.toMap(el -> el, item -> 1, Integer::sum))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(i -> System.out.println(i.getKey() + " : " + i.getValue()));
    }
}