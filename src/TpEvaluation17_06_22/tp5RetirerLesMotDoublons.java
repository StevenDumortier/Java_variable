package TpEvaluation17_06_22;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class tp5RetirerLesMotDoublons {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Phrase : ");
    String phrase = input.nextLine();
    String phraseSansDoublons = "";
    String [] phraseSeparation = phrase.split(" ");
    HashMap<String, Integer> mot = new HashMap<>();
    int i =-1;

    for (String mots : phraseSeparation ) {
        i++;
        if (mot.containsKey(phraseSeparation[i])) {
            int previousValue = mot.get(phraseSeparation[i]);
            mot.replace(phraseSeparation[i], previousValue + 1);
        } else {
            mot.put(phraseSeparation[i], 1);
            phraseSansDoublons+=phraseSeparation[i]+ " ";
        }

    }
    System.out.println(phrase);
    System.out.println(phraseSansDoublons);
    System.out.println(mot);
}
}

