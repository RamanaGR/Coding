package com.edu.interview;

import java.io.File;
import java.util.Objects;

public class LastModifiedFile {
    private File getLatestFileFromDir(String dirPath) {
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            return null;
        }

        File lastModifiedFile = files[0];
        for (int i = 1; i < files.length; i++) {
            if (lastModifiedFile.lastModified() < files[i].lastModified()) {
                lastModifiedFile = files[i];
            }
            System.out.println("File Name:" + files[i].getName() + " and Time: " + files[i].lastModified());
        }
        return lastModifiedFile;
    }

    public static void main(String[] args) {
        LastModifiedFile lmf = new LastModifiedFile();
        System.out.println(Objects.requireNonNull(lmf.getLatestFileFromDir("C:\\Users\\chinn\\OneDrive\\Documents")));
    }
}
