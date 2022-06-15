package exo_java;

import java.util.Scanner;
public class exo20Matrice4x4CalculDiagonale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Combien de ligne doit avoir votre matrice : ");
        int ligne = input.nextInt();
        int[][] matrice = new int[ligne][];

        for (int i = 0; i < ligne; i++) {
            System.out.printf("Afficher le nombre de colonne pour %d : ", i);
            int nombreDeColonnes = input.nextInt();
            matrice[i] = new int[nombreDeColonnes];
            for (int j = 0; j < nombreDeColonnes; j++) {
                System.out.printf("Notez la valeur de la ligne %d à la colonne %d : ", i, j);
                matrice[i][j] = input.nextInt();
            }
        }
        int somme = 0;
        String sommeCalcul = "";
        for (int i = 0; i < ligne; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (i == j) {
                    somme += matrice[i][j];
                    sommeCalcul += matrice[i][j] + " + ";

                }
            }
        }
        sommeCalcul = sommeCalcul.substring(0,sommeCalcul.length()-3);
        System.out.println("La somme de la diagole de cette matrice est :\n"+sommeCalcul + " = " + somme);
    }
}