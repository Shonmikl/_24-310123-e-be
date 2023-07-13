package org.example._2023_07_13.excep;

public class ExceptionExample1 {
    public int divide(int a, int b) throws IncorrectDivideException {
//        if(b == 0) {
//            throw new IncorrectDivideException(ExceptionMessage.DIVIDE_EXCEPTION);
//        }
        return a / b;
    }
}

class Main {
    public static void main(String[] args) {
        ExceptionExample1 example1 = new ExceptionExample1();
        example1.divide(1, 3);
    }
}
