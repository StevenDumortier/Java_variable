package base_java;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class RemplissageTableauMultiDim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Donnez le nombre de ligne : ");
        int taille=input.nextInt();

        int [][] matrice = new int[taille][];
        for (int i =0;i< matrice.length;i++){
            System.out.print("Donnez le nombre de colonne pour la ligne " +i+" : ");
            int nombreDeColonne=input.nextInt();
            matrice[i]=new int[nombreDeColonne];
            for(int j=0;j<matrice[i].length;j++){
                System.out.print("Donnez la valeur pour le tableau numero "+i+ " et la valeur numero "+j+ " : ");
                matrice[i][j]=input.nextInt();
            }

        }
        for (int i =0;i< matrice.length;i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j]);
            }
        }


    }


}
