package org.example._2023_07_13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathEx {
    public static void main(String[] args) {
        Path filePath = Paths.get("E:\\folder\\path.txt");

        System.out.println("File name: " + filePath.getFileName());
        System.out.println("Parent file: " + filePath.getParent());
        System.out.println("Abs path: " + filePath.toAbsolutePath());

        Path subPath = filePath.subpath(0, 2);
        System.out.println("Sub Path: " + subPath);

        boolean isExist = Files.exists(filePath);
        System.out.println("Is exist: " + isExist);

        Path newFilePath = Paths.get("E:\\folder\\path11.txt");
        try {
            Files.createFile(newFilePath);
            System.out.println("New file was created!");
        } catch (IOException e) {
            System.out.println("Can't create a file: " + e.getMessage());
        }

        try {
            Files.delete(newFilePath);
            System.out.println("New file was deleted!");
        } catch (IOException e) {
            System.out.println("Can't delete a file: " + e.getMessage());
        }
    }
}