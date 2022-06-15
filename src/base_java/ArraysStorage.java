package base_java;

import java.util.Arrays;

public class ArraysStorage {
    public static void main(String[] args) {
        // int a;
//        System.out.println(a);  ici a ne contient rien donc erreur
        // Pour les tableau d'entier, java initialise toutes les cellues par 0
        // tableau de float/double par 0.0
        //tableau de boolean par false
        //Tableau de string par null --> un objet qui ne pointe vers rien
        int [] a = new int [5];
        System.out.println("Affichage de l'adresse stockée dans a : ");
        System.out.println(a);

        System.out.println();
        System.out.println("Affichage du tableau : " + Arrays.toString(a));

    }
}
