import java.util.Scanner;
import java.util.regex.*;
public class exo15BonneVersion
{
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        String codePIN = "";
        System.out.println("Veuillez definir un code PIN a 4 caracteres : ");
        while (true) {
            System.out.print("Code PIN : ");
            codePIN = input.nextLine();
            boolean checkNumeric = true;
            checkNumeric = codePIN.matches("[+-]?\\d*(\\.\\d+)?");
            if (!checkNumeric) {
                System.out.println("Error code PIN doit contenir que des chiffres");
            }
            if (codePIN.length() != 4)
            {
                System.out.println("Error Code PIN doit avoir 4 chiffres");
            }
            if(checkNumeric == true && codePIN.length()==4)
            {
                System.out.println("Le code PIN est bien enregistré");
                break;
            }
        }
        System.out.println("************************");
        System.out.println("**Telephone verrouille**");
        System.out.println("************************");

        String codeATester = "";
        while (true)
        {
            System.out.print("Entrez votre code PIN pour deverouiller l'appareil : ");
            codeATester = input.nextLine();
            if(codeATester.equals(codePIN))
            {
                System.out.println("Bravo, appareil deverouille");
                break;
            }
            System.out.println("Code PIN errone.Veuillez recommencer");
        }
    }
}


