package org.example._2023_08_01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Re7 {
    public static void main(String[] args) {
        String cardNumber = "12589632569874200525665";
        Pattern pattern =
                Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(cardNumber);

        String newCard
                = matcher.replaceAll("CARD NUMBER:[$1 $2 $3 $4] EXPIRATION DATE:[$5/$6] CVV:[$7]");
        System.out.println(newCard);
    }
}