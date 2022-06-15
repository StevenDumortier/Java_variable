package exo_java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exo14ConditionLimite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Definissez votre email : ");
        String email = input.nextLine();
        System.out.println("Votre email a ete defini");
        System.out.print("Definissez votre MDP : ");
        String mdp = input.nextLine();
        System.out.println("Votre mdp a ete defini");
        int nombreEssai = 5;
        while (true)
        {
            if (nombreEssai == 0)
            {
                System.out.println("Vous avez saisi des mauvais identifiants 5 fois, votre compte est bloque");
                break;
            }
            System.out.println("Vous avez " + nombreEssai + " tentative pour taper vos bons identifiants");
            System.out.println("Saisissez votre email");
            String email2 = input.nextLine();
            System.out.println("Saisissez votre mdp");
            String mdp2 = input.nextLine();

            if (!email.equals(email2))
            {
                System.out.println("Error, email invalide");
                nombreEssai--;
                continue;
            }
            else if (!mdp.equals(mdp2))
            {
                System.out.println("Error, mdp invalide");
                nombreEssai--;
                continue;
            }
            System.out.println("Bienvenu dans votre espace client ");
            break;
        }

    }
}

