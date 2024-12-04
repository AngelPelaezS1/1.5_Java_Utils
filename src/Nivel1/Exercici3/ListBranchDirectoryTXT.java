package Nivel1.Exercici3;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class ListBranchDirectoryTXT {

    public static void listBranchTXT(String directoryPath, String TXT) {

        File directory = new File(directoryPath);

        if (directory.isDirectory()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(TXT))) {
                exploreDirectory(directory, bw);
                System.out.println("Printing data in" + TXT);

            } catch (IOException e) {
                System.out.println("Error printing in txt");
            }
        } else {
            System.out.println("Error path");
        }

        private static void exploreDirectory (File directory, BufferedWriter bw) throws IOException {

            File[] files = directory.listFiles();

            if (files != null) {
                Arrays.sort(files);
            }

            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

            for (File file : files) {
                String fileType = " ";

                if (file.isDirectory()) {
                    fileType = "D";
                    System.out.println(date);
                } else {
                    fileType = "F";
                }
            }

        }
    }
}