package TpEvaluation17_06_22;

import java.util.Arrays;
import java.util.Scanner;

public class tp6Tableau2DAfficheNombreFoisEtPosition {
    public static void main(String[] args) {
       int [][] tableau = {{1, 4, 2, 1},{6, 3, 8, 9},{1, 5, 1, 0}};
       int nombre = 1;
       int compteur = 0;
        for(int i=0;i< tableau.length;i++) {
            for(int j=0;j<tableau[i].length;j++)
            {
                if (nombre == tableau[i][j]){
                    compteur++;
                    System.out.print("("+i+","+j+") ");
                }

            }
        }
        System.out.print("Le nombre " + nombre + " S'affiche "+compteur+ " fois");

    }
}
