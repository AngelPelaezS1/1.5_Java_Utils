package Nivel1.Exercici3;

public class Main {


    public static void main(String[] args) {

        if (args.length == 2) {
            String directoryPath = args[0];
            String outputFile = args[1];
            ListBranchDirectoryTXT.listBranchTXT(directoryPath, outputFile);
        } else {
            System.out.println("Error, you need to provide 2 arguments");
        }
    }
}