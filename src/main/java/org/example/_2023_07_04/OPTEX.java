package org.example._2023_07_04;

import java.util.Optional;

public class OPTEX {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("!!");
        if(optional.isPresent()) {
            System.out.println(optional);
        } else {
            System.out.println("+++++");
        }
    }
}
