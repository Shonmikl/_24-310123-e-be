package org.example._2023_09_12.reflex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CalculatorMain {
    public static void main(String[] args) throws RuntimeException {
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            String methodName = reader.readLine();
            String firstArgument = reader.readLine();
            String secondArgument = reader.readLine();

            Calculator calculator = new Calculator();
            Class<? extends Calculator> calculatorObject = calculator.getClass();
            Method method = null;

            Method[] methods = calculatorObject.getDeclaredMethods();
            for (Method myM : methods) {
                if(myM.getName().equals(methodName)) {
                    method = myM;
                }
            }

            assert method != null;
            method.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));

        } catch (IOException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}