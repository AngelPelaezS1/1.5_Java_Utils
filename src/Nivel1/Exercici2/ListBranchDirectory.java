package Nivel1.Exercici2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class ListBranchDirectory {

    public static void listBranch(String path) {

        File directory = new File(path);

        if (directory.isDirectory()) {
            exploreDirectory(directory);
        } else {
            System.out.println("Error path");
        }
    }
    
    private static void exploreDirectory(File directory) {

        File [] files = directory.listFiles();

        if(files != null){
            Arrays.sort(files);
        }

        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

        for(File file : files){
            String fileType = " ";

            if(file.isDirectory()){
                fileType = "D";
            }else{
                fileType = "F";
            }

            String lastDate = date.format(file.lastModified());
            System.out.println(fileType+" "+file.getName()+" "+lastDate);

        }

    }
}