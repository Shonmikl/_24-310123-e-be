package org.example._2023_06_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex33 {
    public static void main(String[] args) {
               //x = 5
        String[] s = {"QQ", "WW", "JJ", "KK"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        for (String name : s) {
            System.out.println(name);
        }
                    //  x = 5
        List<String> list = new ArrayList<>();
        list.add("QQ");
        list.add("AA");
        list.add("DD");
        list.add("RR");
        list.add("TT");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String name : list) {
            System.out.println(name);
        }
                    //x = 5
        Set<String> set = new HashSet<>();
        set.add("EE");
        set.add("FF");
        set.add("VV");
        set.add("BB");
        set.add("JJ");

        System.out.println(set);
//        for (int i = 0; i < set.size(); i++) {
//            System.out.println();
//        }
        for (String name : set) {
            System.out.println(name);
        }

    }
}