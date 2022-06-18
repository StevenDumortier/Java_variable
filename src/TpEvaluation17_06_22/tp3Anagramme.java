package TpEvaluation17_06_22;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class tp3Anagramme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ecrire un premier mot");
        String mot = input.nextLine();
        System.out.println("Ecrire un deuxieme mot");
        String mot2 = input.nextLine();

        if (mot.length()!=mot2.length()){
            System.out.println("Ce n'est pas un Anagramme");
            System.exit(1);
        }
        char[] motEnTableau = mot.toLowerCase().toCharArray();
        Arrays.sort(motEnTableau); //sort pour ranger le tableau dans l'ordre alphabetique

        char[] mot2EnTableau = mot2.toLowerCase().toCharArray();
        Arrays.sort(mot2EnTableau);

        if (Arrays.equals(motEnTableau,mot2EnTableau)){
            System.out.println("Anagramme");}
        else{
            System.out.println("pas Anagramme");}



//        for (int i = 0; i<mot2EnTableau.length-1;i++)
//        {
//            System.out.println(mot2EnTableau[i]+motEnTableau[i]);
//            if (motEnTableau[i]!=mot2EnTableau[i])
//            {
//                System.out.println("Ce n'est pas un anagramme");
//                System.exit(1);
//            }
//        }
//        System.out.println("C'est un anagramme");
//            System.out.println("C'est un anagramme");
//        else
//            System.out.println("Ce n'est pas un anagramme");


//        for (int i=0;i<mot.length();i++)
//        {
//            mot=Arrays.sort(mot)
//            if (mot[i])
//                case "a":
//                }
//            }
//        }

    }
}
