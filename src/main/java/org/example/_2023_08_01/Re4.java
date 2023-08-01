package org.example._2023_08_01;

import java.util.regex.Pattern;

public class Re4 {
    public static void main(String[] args) {
        String ip1 = "255.0.1.1";
        String ip2 = "255.0.1.255";
        Re4 re4 = new Re4();
        re4.check(ip1);
        re4.check(ip2);
    }

    private void check(String i) {
        //String ip1 = "255.0.1.1";
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        System.out.println(Pattern.matches(regex, i));
    }
}