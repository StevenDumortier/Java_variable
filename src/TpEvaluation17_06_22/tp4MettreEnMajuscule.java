package TpEvaluation17_06_22;

import java.util.Arrays;
import java.util.Scanner;

public class tp4MettreEnMajuscule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Phrase : ");
        String phrase = input.nextLine();



        String [] phraseSeparation = phrase.split(" ");
        for (String mot : phraseSeparation ) {
          String phraseMajuscule = mot.substring(0, 1).toUpperCase() + mot.substring(1,mot.length()) + " ";
            System.out.print(phraseMajuscule);
        }



//        for (int i = 0; i<phrase.length();i++)
//            if (phrase.charAt(i) ==" ") {
//
//        }
//
//        (phrase.toUpperCase(1))
//
//        }
    }
}
