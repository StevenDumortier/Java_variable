package TpEvaluation17_06_22.tp10Tirelire.VersionProcedurale;

import java.util.Scanner;

public class Main {
    static Double montant=0.0;


    public static double getMontant() {
            return montant;}

    public static String affichage() {
        if (montant == 0) {
            return "Vous etes sans sou";
        } else {
            return "Vous avez " + montant + " euros dans votre tirelire";
        }
    }

    public static String secouer() {
        String text ="";
        if (montant > 0)
            text = "bling bling\n";
        return text;
        }

        public static void remplir(double ajout) {
            if (ajout > 0) {
                montant += ajout;
            }
        }

        public static void vider() {
            montant = 0.0;
        }

        public static void puiser(double retirer) {
            if (retirer >= 0) {
                montant -= retirer;
            }
        }

        public static void calculerSolde() {
            Scanner input = new Scanner(System.in);
            System.out.print("Donnez le budget de vos vacances : ");
            double budget = input.nextDouble();
            double differenceMontantBudget;
            if (budget <= 0) {
                System.out.printf("Montant de votre tirelire %.2f euros \n", montant);
            } else if (budget <= montant) {
                differenceMontantBudget = montant - budget;
                System.out.printf("Vous etes assez riche pour vos vacances, il vous restera %.2f euros apres vos depenses \n", differenceMontantBudget);
            } else if (budget > montant) {
                differenceMontantBudget = montant - budget;
                differenceMontantBudget= Math.abs(differenceMontantBudget);
                System.out.printf(" Il vous manque %.2f euros pour partir en vacance\n", differenceMontantBudget);
            }
        }

    public static void main(String[] args) {
        remplir(20);
        System.out.println(affichage());
        calculerSolde();
        System.out.println(getMontant());
        System.out.print(secouer());
        vider();
        System.out.print(secouer());
        System.out.println(getMontant());

    }
    }

