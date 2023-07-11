package org.example._2023_07_11;

import java.io.FileWriter;
import java.io.IOException;
//text
public class FileWriterEx {
    public static void main(String[] args) {
        String str = "Sofía Vergara ha celebrado los 30 millones de " +
                "seguidores en su cuenta de Instagram como solo ella sabe, " +
                "con un posado espectacular en bañador. Muy del estilo " +
                "Salma Hayek, la colombiana sorprendía a todos sus " +
                "followers con unas impresionantes fotos con el mar " +
                "de fondo y uno de los bañadores que más veremos " +
                "esta temporada.";

        try (FileWriter fileWriter = new FileWriter("sofia.txt")) {
            for (int i = 0; i < str.length(); i++) {
                fileWriter.write(str.charAt(i));
            }
            System.out.println("\n");
            System.out.println("DONE!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}