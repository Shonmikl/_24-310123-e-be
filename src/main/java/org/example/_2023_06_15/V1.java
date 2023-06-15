package org.example._2023_06_15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class V1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(4);
        list.add(4);

        Iterator<Integer> iterator = list.iterator();;
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
    }
}
