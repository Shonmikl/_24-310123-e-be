package org.example._2023_08_08.easy;

public class Ex1 {
    public int getSum(int a, int b) {
        return a + b;
    }

    public int getDivide(int a, int b) {
        if(b == 0) {
            throw new DivideByZeroException();
        }
        return a / b;
    }
}