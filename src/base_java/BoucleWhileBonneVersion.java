package base_java;

import java.util.Scanner;
public class BoucleWhileBonneVersion {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        String codePIN="";
        System.out.println("Veuillez definir un code PIN a 4 caracteres : ");
        while (true){
            System.out.print("Code PIN : ");
            codePIN=input.nextLine();
            if(codePIN.length() == 4){
                System.out.println("Code PIN defini avec succes");
                break;
            }
            System.out.println("Error : Le code PIN doit etre compose de 4 caracteres");
        }
//
        System.out.println("************************");
        System.out.println("**Telephone verrouille**");
        System.out.println("************************");

        String codeATester = "";
        while (true) {
            System.out.print("Entrez votre code PIN pour deverouiller l'appareil : ");
            codeATester = input.nextLine();
            if(!codeATester.equals(codePIN)){
                System.out.println("Bravo, appareil deverouille");
                break;
            }
            System.out.println("Code PIN errone.Veuillez recommencer");
        }
    }
}