package org.example._2023_06_29;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class STREX1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 20, 3, 4, 1, 1, 5, 6, 7, 8);

//        //collect()
//        Set<Integer> set = numbers.stream()
//                .collect(Collectors.toSet());
//        System.out.println(set);

//        //reduce
//        int f = numbers.stream()
//                .reduce(1000, (i1, i2) -> i1 + i2);
//        System.out.println(f);


//        //allMatch()
//        boolean b = numbers.stream().allMatch(el -> el > 2);
//        System.out.println(b);

//        //anyMatch()
//        boolean b = numbers.stream().anyMatch(el -> el > 2);
//        System.out.println(b);

//        //noneMatch()
//        boolean b = numbers.stream().noneMatch(el -> el > 2);
//        System.out.println(b);


//        List<Integer> a = new ArrayList<>();
//        a.add(8888);
        //limit()
//        List<Integer> s = numbers.stream()
//                .sorted()
//                .distinct()
//                .filter(el -> el %2 == 0)
//                .skip(3)
//                .toList();
//
////        a.addAll(s);
//        System.out.println(s);

        //distinct()
//        int f = numbers.stream()
//                .map(el -> {
//                    if (el % 2 == 0) {
//                        el = el * 11;
//                    }
//                    return el;
//                }).filter(el -> el > 100)
//                .sorted()
//                .distinct()
//                .map(el -> el / 15)
//                .sorted(Comparator.reverseOrder())
//                .reduce((el1, el2) -> el1 - el2)
//                .filter(el -> el > 0)
//                .get();
//        System.out.println(f);

//        //map
//        numbers.stream()
//                .map(item -> item * 10)
//                .forEach(System.out::println);


        //filter()
//        List<Integer> list = numbers
//                .stream() // 1,2,3,4,5,6,7,8
//                .filter(el -> el % 2 == 0) //2,4,6,8
//                .toList();
//        System.out.println(list);

        List<List<Integer>> groups = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(2,3),
                Arrays.asList(4,5),
                Arrays.asList(6,7)
        );

        List<Integer> y = groups.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(y);
    }
}