package Nivel1.Exercici4;

import java.io.*;

public class ReadTxt {

    public static void readTxt(String filePath){
        File file = new File(filePath);

        if(file.exists() && file.isFile() && file.getName().endsWith(".txt")){
            try(BufferedReader reader = new BufferedReader(new FileReader(file))){
                String line;
                while((line = reader.readLine()) != null){
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error in the file " +e.getMessage());
            }
        }else{
            System.out.println("The file does not exist or is not a txt");
        }
    }
}
