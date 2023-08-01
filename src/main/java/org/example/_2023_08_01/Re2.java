package org.example._2023_08_01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * \d - одной цифре
 * \D - одной НЕ цифре
 * \w - одной букве цифре или _
 * \W
 * \s - пробел
 * \S -
 * \A - выражение в начале стринги
 * \Z
 * \b - граница слова или числа
 * \B -
 * RE? - 0 или 1 повторение
 * RE* - 0 или больше повторений
 * RE+ - 1 или больше повторений
 * RE{n} - n повторений
 * RE{n,m} повторения от n - m
 * RE{n,} n +.........
 */
public class Re2 {
    public static void main(String[] args) {
        String s = "ASD ASDF ASDGTRY A3SDA9YTIUASBDG";
//        Pattern pattern = Pattern.compile("\\d");
//        Pattern pattern = Pattern.compile("\\D");
//        Pattern pattern = Pattern.compile("\\w");
//        Pattern pattern = Pattern.compile("\\w+");
//        Pattern pattern = Pattern.compile("\\W+");
        Pattern pattern = Pattern.compile("\\w{2}");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " : " + matcher.group());
        }
    }
}
