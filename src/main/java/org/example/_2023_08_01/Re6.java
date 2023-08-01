package org.example._2023_08_01;

public class Re6 {
    public static void main(String[] args) {
        String s = "Hay,     no     obstante@gmail.com,     un   modo       2023";
        System.out.println(s);

//        s = s.replaceAll(" {2,}", "^");
        s = s.replaceAll("\\b[nm]\\w+", "000");

        System.out.println(s);
    }
}