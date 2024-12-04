package Nivel1.Exercici2;

public class Main {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Error");
        } else {
            String input = args[0];
            ListBranchDirectory.listBranch(input);

        }
    }
}

