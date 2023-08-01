package org.example._2023_08_01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Re3 {
    public static void main(String[] args) {
        String s = "Hay, no obstante@gmail.com, un modo 2023 de utilizar WhatsApp que, " +
                "coloquialmente, se +1234 esta@yahoo.com denominando 01.08.+2023 modo infiel. " +
                "No hace falta explicar por que";

//        Pattern pattern = Pattern.compile("\\w+");
//        Pattern pattern = Pattern.compile("\\d{2}");
//        Pattern pattern = Pattern.compile("\\b\\d{4}\\b");
//        Pattern pattern = Pattern.compile("\\+\\d{4}");
//        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(com|ru)");
//        Pattern pattern = Pattern.compile("\\D{2,4}");
//        Pattern pattern = Pattern.compile("\\D{2,}");
//        Pattern pattern = Pattern.compile("\\D(po)?");
//        Pattern pattern = Pattern.compile("\\AHay");
        Pattern pattern = Pattern.compile("que\\Z");

        // 1 @ 2 . com|ru|es
        // ASDGFTYTTAGSGDTYJVHBVFVDG --> 2A2S3D hw

        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " : " + matcher.group());
        }
    }
}