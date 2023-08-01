package org.example._2023_08_01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Re1 {
    public static void main(String[] args) {
        String s = "ASD ASDF ASDGTRY A3SDA9YTIUASBDG";
//        Pattern pattern = Pattern.compile("ASD"); ищет все слово
//        Pattern pattern = Pattern.compile("[ASD]"); ищет буквы в скобках
//        Pattern pattern = Pattern.compile("AS[DB]");
//        Pattern pattern = Pattern.compile("A[A-Z0-9][A-Z]");
//        Pattern pattern = Pattern.compile("A[^A-Z][A-Z]");
//        Pattern pattern = Pattern.compile("A[S3](D|S)"); $ - выражение в конце строки
//        Pattern pattern = Pattern.compile("A[^A-Z][A-Z]");
//        Pattern pattern = Pattern.compile("ASD."); любой символ после выражения
        Pattern pattern = Pattern.compile("[^ASD]");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " : " + matcher.group());
        }
    }
}