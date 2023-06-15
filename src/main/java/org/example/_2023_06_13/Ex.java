package org.example._2023_06_13;

public class Ex {

    public static int m(Integer obj, int bucketNumber) {
        int h = obj.hashCode();
        return h % bucketNumber;
    }
    public static void main(String[] args) {
        String u = null;
        String u1 = "MAMA";
        "MAMA".length();
        //x = 5
        //x + y = 15

        System.out.println(m(25458, 36));
    }
}