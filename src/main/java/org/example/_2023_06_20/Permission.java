package org.example._2023_06_20;

import java.util.List;

public enum Permission {
    TOP,
    HIGH,
    MEDIUM,
    LOW;
}

enum CurrencyCode {
    USD(SubLevel.C),
    EUR(SubLevel.C),
    RUR(SubLevel.C),
    CAD(SubLevel.B);

    private SubLevel subLevel;

    CurrencyCode(SubLevel subLevel) {
        this.subLevel = subLevel;
    }
}

class Security {
    private String name;
    private Permission permission;

    public Security(String name, Permission permission) {
        this.name = name;
        this.permission = permission;
    }
}

class Main {
    public static void main(String[] args) {
        Security p1 = new Security("Mik", Permission.MEDIUM);
        CurrencyCode[] currencyCodes;
    }
}

class WWWWWWWWWWWWWWWWWWWWW {
    public static void main(String[] args) {
        WWWWWWWWWWWWWWWWWWWWW[] wwwwwwwwwwwwwwwwwwwwws;
        List<WWWWWWWWWWWWWWWWWWWWW> wwwwwwwwwwwwwwwwwwwwwList;
        List<CurrencyCode> currencyCodes;
    }
}

enum SubLevel {
    A,
    B,
    C
}