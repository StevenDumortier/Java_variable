package TpEvaluation17_06_22;

import java.util.HashMap;
import java.util.Scanner;

public class tp5BonneVersionPourLesLettresDoublons {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Phrase : ");
        String phrase = input.nextLine();
        String phraseSansDoublons = "";
        HashMap<Character, Integer> lettre = new HashMap<>();

        for (int i = 0; i < phrase.length(); i++) {
            if (lettre.containsKey(phrase.charAt(i))) {
                int previousValue = lettre.get(phrase.charAt(i));
                lettre.replace(phrase.charAt(i), previousValue + 1);
            } else {
                lettre.put(phrase.charAt(i), 1);
                phraseSansDoublons+=phrase.charAt(i);
            }

        }
        System.out.println(phrase);
        System.out.println(phraseSansDoublons);
        System.out.println(lettre);
    }
}