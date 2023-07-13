package org.example._2023_07_13;

import java.io.File;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("example.mp3");

        boolean created = file.createNewFile();
        if(created) {
            System.out.println("File was created: " + file.getAbsolutePath());
        }

        System.out.println("File name: " + file.getName());
        System.out.println("File size: " + file.length());

        boolean isDirectory = file.isDirectory();
        System.out.println("Is directory: " + isDirectory);

//        File renamedFIle = new File("renamed.txt");
//        boolean renamed = file.renameTo(renamedFIle);
//        if(renamed) {
//            System.out.println("File was renamed");
//        }

//        boolean deleted = renamedFIle.delete();
//        if(deleted) {
//            System.out.println("File was deleted");
//        }
    }
}