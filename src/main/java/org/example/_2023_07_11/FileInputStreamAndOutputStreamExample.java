package org.example._2023_07_11;

import java.io.*;

//binary
public class FileInputStreamAndOutputStreamExample {
    public static void main(String[] args) {
//        try (BufferedReader reader = new BufferedReader(new FileReader("java.png"));
//             BufferedWriter writer = new BufferedWriter(new FileWriter("javaFWT.png"))) {
//            int ch;
//            while ((ch = reader.read()) != -1) {
//                writer.write(ch);
//            }
//
//            System.out.println("DONE!");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        try (FileInputStream inputStream = new FileInputStream("java.png");
             FileOutputStream outputStream = new FileOutputStream("newJava.png")) {
            int bit;
            while ((bit = inputStream.read()) != -1) {
                outputStream.write(bit);
            }
            System.out.println("DONE!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}