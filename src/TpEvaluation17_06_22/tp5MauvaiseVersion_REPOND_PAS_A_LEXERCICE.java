package TpEvaluation17_06_22;

import java.util.Scanner;

public class tp5MauvaiseVersion_REPOND_PAS_A_LEXERCICE {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Phrase : ");

        String phrase = input.nextLine();
        String phraseSansDuublon = "";
        int compteur = 0;
//        StringBuilder phraseBuild = new StringBuilder(phrase);
//        char [] phraseChar = phrase.toCharArray();
//        for(char i : phraseChar){
//            for(char j : phraseChar){
        for (int i =0; i<phrase.length();i++){
            compteur=0;
            for (int j =0; j<phrase.length();j++){

                if (j<phrase.length() && i<j && (phrase.charAt(i) == phrase.charAt(j))) {
                    compteur++;
//                    System.out.println(phrase.charAt(j));
//                    phraseBuild = phraseBuild.deleteCharAt(j);
//                    phrase.substring(phrase.charAt(j) ='';
//                    phrase.replace(phrase.charAt(j),' ');
                    continue;
                }
                else if(j==phrase.length()-1 && compteur==0)
                    phraseSansDuublon+=phrase.charAt(i);
            }
        }
        System.out.println(phraseSansDuublon);
    }
}
