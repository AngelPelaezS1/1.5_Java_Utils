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
                System.out.println("Printing data in " + TXT);
            } catch (IOException e) {
                System.err.println("Error printing in txt: " + e.getMessage());
            }
        } else {
            System.out.println("Error: Invalid path");
        }
    }

    private static void exploreDirectory(File directory, BufferedWriter bw) throws IOException {
        File[] files = directory.listFiles();

        if (files != null) {
            Arrays.sort(files);
        }

        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

        for (File file : files) {
            String fileType = " ";

            if (file.isDirectory()) {
                fileType = "D";
            } else {
                fileType = "F";
            }
            String lastDate = date.format(file.lastModified());

            bw.write(fileType + " " + file.getName() + " " + lastDate);
            bw.newLine();

            if (file.isDirectory()) {
                exploreDirectory(file, bw);
            }
        }
    }
}
