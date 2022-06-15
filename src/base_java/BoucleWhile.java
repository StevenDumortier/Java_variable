package base_java;

import java.util.Scanner;
public class BoucleWhile {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Veuillez definir un code PIN : ");
        int codePIN = input.nextInt();
        System.out.println("*****************");
        System.out.println("**Telephone verouillé**");
        System.out.println("*****************");

        int codeATester=0;
        while (codeATester!=codePIN);
        {
            System.out.println("Entrez votre code PIN");
            codeATester=input.nextInt();
        }
    }
}
