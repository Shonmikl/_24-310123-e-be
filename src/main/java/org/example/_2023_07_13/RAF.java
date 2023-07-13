package org.example._2023_07_13;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAF {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("raf.txt", "rw")) {
//            int a = file.read();
//            System.out.println((char) a);
//
//            int a1 = file.read();
//            System.out.println((char) a1);
//
//            String s = file.readLine();
//            System.out.println(s);
            file.seek(222);
            String s = file.readLine();
            System.out.println(s);

            long l = file.getFilePointer();
            System.out.println(l);

            int a = file.read();
            System.out.println((char) a);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}