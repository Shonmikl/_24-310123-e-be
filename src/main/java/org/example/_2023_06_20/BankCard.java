package org.example._2023_06_20;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Getter
public class BankCard {
    private int CVV;
    private Date expDate;
    private String holderName;
    private String holderSurname;
    private CurrencyCode currencyCode;
}

class Test986 {

    private static void statusChecker(List<Security> securities) {

    }

    public static void main(String[] args) {
        List<BankCard> bankCards = new ArrayList<>();
        for (int i = 0; i < bankCards.size(); i++) {
            if(bankCards.get(i).getCurrencyCode().equals(CurrencyCode.USD)) {
                System.out.println("Операция может быть осуществлена только в 'EUR'");
            } else if (bankCards.get(i).getExpDate() == new Date("21-05-2025")) {
                //
            }
        }
    }
}