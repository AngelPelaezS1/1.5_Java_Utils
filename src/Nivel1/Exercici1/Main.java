package Nivel1.Exercici1;

public class Main {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Error");
        } else {
            ListDirectory.readDirectory(args);
        }
    }
}
