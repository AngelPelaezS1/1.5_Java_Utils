package Nivel1.Exercici4;

public class Main {

    public static void main(String[] args) {

        if(args.length == 1){
            String input = args[0];
            ReadTxt.readTxt(input);
        }else{
            System.out.println("Error in the arguments");
        }
    }
}
