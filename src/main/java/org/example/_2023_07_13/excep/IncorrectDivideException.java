package org.example._2023_07_13.excep;

public class IncorrectDivideException extends RuntimeException{
    public IncorrectDivideException(String message){
        super(message);
    }
}

class  ExceptionMessage {

    public static final String DIVIDE_EXCEPTION = "Param 'b' is '0'";
}