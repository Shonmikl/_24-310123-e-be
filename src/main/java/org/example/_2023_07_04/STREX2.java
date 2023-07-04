package org.example._2023_07_04;

import java.util.*;
import java.util.stream.Collectors;

public class STREX2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 8, 74, 5, 63, 2, 10, 14, 5, 87, 96, 3, 2);

        //count
        long l = list.stream().count();
        System.out.println(l);
        System.out.println("------------------------------------------");

        //max
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        max.ifPresent(v -> System.out.println("Max: " + v));
        System.out.println("------------------------------------------");

        //min
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        min.ifPresent(v -> System.out.println("Min: " + v));
        System.out.println("------------------------------------------");

        //findFirst
        Optional<Integer> first = list.stream().findFirst();
        first.ifPresent(v -> System.out.println("First: " + v));
        System.out.println("------------------------------------------");

        //findAny
        Optional<Integer> any = list.stream().findAny();
        any.ifPresent(v -> System.out.println("Any: " + v));
        System.out.println("------------------------------------------");

        //forEach
        System.out.println("ForEach: ");
        list.forEach(System.out::println);
        System.out.println("------------------------------------------");

        //distinct
        System.out.println("Distinct: " + list.stream().distinct().toList());
        System.out.println("------------------------------------------");

        //skip
        System.out.println("Skip: " + list.stream().skip(5).toList());
        System.out.println("------------------------------------------");

        //peek
        System.out.println("Peek: " + list.stream().map(e -> e * 10).peek(System.out::println).map(e->e/10).toList());
        System.out.println("------------------------------------------");

        //limit
        System.out.println("Limit: " + list.stream().limit(2).toList());
        System.out.println("------------------------------------------");

        //toArray
        System.out.println("To Array: " + Arrays.toString(list.toArray(Integer[]::new)));
        System.out.println("------------------------------------------");

        //reduce
        System.out.println("Reduce: " + list.stream().reduce( Integer::sum));
        System.out.println("------------------------------------------");

        //collect
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        System.out.println("ToSet: " + set);
        System.out.println("------------------------------------------");

        //mapToInt
        int a = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(a);
        System.out.println("------------------------------------------");

        //flatMap
        List<List<Integer>> groups = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5,6),
                Arrays.asList(7,8)
        );

        List<Integer> y = groups.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(y);
    }
}