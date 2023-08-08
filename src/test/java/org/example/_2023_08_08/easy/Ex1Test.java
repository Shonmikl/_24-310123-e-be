package org.example._2023_08_08.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ex1Test {
    private static final Ex1 EX = new Ex1();
    private static final int A = 10;
    private static final int B = 5;
    private static final int C = 0;

    @Test
    void getSumTest() {
        Assertions.assertEquals(15, EX.getSum(A, B));
    }

    @Test
    void getDividePositiveTest() {
        Assertions.assertEquals(2, EX.getDivide(A, B));
    }

    @Test
    void getDivideByZeroExceptionTest() {
        Assertions.assertThrows(DivideByZeroException.class, () -> EX.getDivide(A, C));
    }
}