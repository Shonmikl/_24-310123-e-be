package org.example._2023_07_13;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearcher {
    public static void main(String[] args) {

        List<File> list = new ArrayList<>();
        getFiles(new File("D:\\"), list);
        for (File file : list) {
            System.out.println("*****" + file.getAbsolutePath() + "*****");
        }
    }

    private static void getFiles(File rootFile, List<File> fileList) {
        if (rootFile.isDirectory()) {
            System.out.println("searching....." + rootFile.getAbsolutePath());
            File[] directoryFile = rootFile.listFiles();

            if (directoryFile != null) {
                for (File f : directoryFile) {

                    if (f.isDirectory()) {
                        getFiles(f, fileList);
                    } else {
                        if (f.getName().endsWith(".xls")) {
                            fileList.add(f);
                        }
                    }
                }
            }
        }
    }
}