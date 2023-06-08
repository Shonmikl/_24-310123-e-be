package org.example._2023_06_08;

import lombok.AllArgsConstructor;

import java.util.*;

public class EandH {
    public static void main(String[] args) {
        int a; //stack
        Integer b; //heap
        T1000 t1000; //имплементиться от Comparable<T1000>

        List<T1000> t1000List = new LinkedList<>(); // индексы, хранит порядок добавления
        List<T1000> t1000List1 = new ArrayList<>(); // индексы, хранит порядок добавления

        Set<T1000> t1000Set = new HashSet<>(); //не хранит повторы, не хранит порядок
        Set<T1000> t1000Set1 = new TreeSet<>(); //не хранит повторы, сортирует
        Set<T1000> t1000Set2 = new LinkedHashSet<>(); //не хранит повторы, хранит порядок

//        T1000 t10001 = new T1000();
//        T1000 t10002 = new T1000();
        T1000 t10003 = null;

//        System.out.println(t10003);

        //  System.out.println(t10001 == t10002);
        //  System.out.println(t10001.equals(t10002));

        String s = "!!";
        String d = "!!";

        String u = new String("!!");

//        System.out.println(s == d); // true
//        System.out.println(s == u); // false
//
//        System.out.println(s.equals(d)); // true
//        System.out.println(s.equals(u)); // true


        /**
         * equals - значение
         * hashCode - код объекта
         * == - ссылки
         * instance of - тип объекта
         */

        T1000 T1 = new T1000("T", "T1000", 100, 838.8f);
        T1000 T2 = new T1000("T1111", "T1000", 100, 838.8f);

        System.out.println(T1.hashCode());
        System.out.println(T2.hashCode());
        System.out.println(T1.equals(T2));
    }
}

@AllArgsConstructor
class T1000 {
    String name;
    String model;
    Integer power;
    Float voltage;

    public static void get(DoubleSummaryStatistics[]... str) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof T1000 t1000)) return false;
        return power.equals(t1000.power)
                && Float.compare(t1000.voltage, voltage) == 0
                && Objects.equals(name, t1000.name)
                && Objects.equals(model, t1000.model);
    }

    @Override
    public int hashCode() { //f(x)
        return Objects.hash(name, model, power, voltage);
        //o1 == 1 ;; o2 == 2
        //o1 == 3 ;; o2 == 3
    }
}