package base_java;

import javax.swing.*;
import java.util.Scanner;

public class StringStorage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nom = "Christian";
        String nom2 = "Christian";
        if (nom==nom2){
            System.out.println("nom pointe vers le même string que nom2");
        }
        else{
            System.out.println("nom ne point pas vers le même string que nom2");
        }

        System.out.println("Entrez un nom");
        String nom3 = input.nextLine();
        // Ce test va être évalué a false
        // car les strings fournis au clavier ne sont pas stocké dans
        // le pool des littéraux
        if (nom == nom3)
        {
            System.out.println("nom pointe vers le même string que nom3");
        }
        else
        {
            System.out.println("nom ne pointe pas vers le meme string que nom3");
        }
        System.out.println("Tester les valeurs stockés dans 2 stings");
        if (nom.equals(nom3))
        {
            System.out.println("Les valeurs des string nom et nom 3 sont identique");
        }
        else
        {
            System.out.println("Les valeurs des string nom et nom 3 sont différents");
        }
        // Mettre le string stocké dans nom3 dans le pool des littéraux
        System.out.println("test avant d'ajouter nom3 dans le pool");
        nom3 = nom3.intern();
        if (nom == nom3)
        {
            System.out.println("nom pointe vers le même string que nom3");
        }
        else
        {
            System.out.println("nom ne pointe pas vers le meme string que nom3");
        }
        System.out.println("test après d'ajouter nom3 dans le pool");
    }
}
