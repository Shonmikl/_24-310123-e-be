package org.example._2023_06_06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ex22 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("RR");
        list.add("QQ");
        list.add("II");
        list.add("YY");
        list.add("LL");

        //System.out.println(list);
        //движется от начала в конец
        Iterator<String> iterator = list.iterator();
        ListIterator<String> listIterator = list.listIterator(list.size() / 2);
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // RR QQ WW EE UU
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(list);
    }
}
