package org.example._2023_07_11;

import java.io.FileReader;
import java.io.IOException;

//text
public class FileReaderEx {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("wce.txt")) {
            int ch;

            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
            }

            System.out.println("\n");
            System.out.println("DONE!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}