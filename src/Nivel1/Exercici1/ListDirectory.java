package Nivel1.Exercici1;

import java.io.File;
import java.util.Arrays;

public class ListDirectory {

    public static void readDirectory(String[] args) {
        String path = args[0];
        File directory = new File(path);

        if (directory.isDirectory()) {
            String[] files = directory.list();
            if (files != null) {
                Arrays.sort(files);

                for (String f : files) {
                    System.out.println(f);
                }

            } else {
                System.out.println("Error, the directory is empty");
            }
        } else {
            System.out.println("Error, the path does not exist.");
        }
    }
}
