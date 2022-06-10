import java.util.Scanner;
import java.util.regex.*;

public class exo15_2AjoutTousLesCodeseEXO15_BoucleWhileBonneVersion {
        public static void main(String[] args) {
            var input = new Scanner(System.in);
            String codePIN="";
            System.out.println("Veuillez definir un code PIN a 4 caracteres : ");
            while (true){
                System.out.print("Code PIN : ");
                codePIN=input.nextLine();
                boolean checkNumeric = true;
                checkNumeric=codePIN.matches("[+-]?\\d*(\\.\\d+)?");
                if(checkNumeric)
                {
                    if(codePIN.length() == 4)
                    {
                        System.out.println("Code PIN defini avec succes");
                        break;
                    }
                    else
                    {
                        System.out.println("Error : Saisissez 4 chiffres numérique");
                    }
                }
                else if (checkNumeric==false)
                System.out.println("Error : Le code PIN doit etre compose de 4 caracteres numerique, recommencez");
            }

            System.out.println("************************");
            System.out.println("**Telephone verrouille**");
            System.out.println("************************");

            String codeATester = "";
            while (true) {
                System.out.print("Entrez votre code PIN pour deverouiller l'appareil : ");
                codeATester = input.nextLine();
                if(codeATester.equals(codePIN)){
                    System.out.println("Bravo, appareil deverouille");
                    break;
                }
                System.out.println("Code PIN errone.Veuillez recommencer");
            }
        }
    }

