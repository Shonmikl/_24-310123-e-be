package org.example._2023_07_11;

import java.io.*;
//text
public class BufferedReaderAndWriterExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("wce.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("br.txt"))) {

//            int ch;
//            while ((ch = reader.read()) != -1) {
//                writer.write(ch);
//            }

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }

            System.out.println("DONE!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}