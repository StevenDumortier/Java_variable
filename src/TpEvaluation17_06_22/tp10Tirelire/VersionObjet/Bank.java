package TpEvaluation17_06_22.tp10Tirelire.VersionObjet;

import java.util.Scanner;

public class Bank {

    private double montant;
    private double retirer;
    private double ajout;
    private double budget;
    private double differenceMontantBudget;

    public String text ="";

    public double getMontant() {
        return this.montant;
    }

    @Override
    public String toString() {
        if (this.montant == 0) {
            return "Vous etes sans sou";
        } else {
            return "Vous avez " + this.montant + " euros dans votre tirelire";
        }
    }

    public String secouer() {
        if (this.montant > 0)
            this.text = "bling bling\n";
            return text;
    }

    public void remplir(double ajout) {
        this.ajout = ajout;
        if (this.ajout > 0) {
            this.montant += this.ajout;
        }
    }

    public void vider() {
        this.montant = 0;
    }

    public void puiser(double retirer) {
        if (retirer >= 0) {
            this.retirer = retirer;
            this.montant -= this.retirer;
        }
    }

    public void calculerSolde() {
        Scanner input = new Scanner(System.in);
        System.out.print("Donnez le budget de vos vacances : ");
        this.budget = input.nextDouble();
        if (budget <= 0) {
            System.out.printf("Montant de votre tirelire %.2f euros \n", this.montant);
        } else if (budget <= montant) {
            this.differenceMontantBudget = this.montant - this.budget;
            System.out.printf("Vous etes assez riche pour vos vacances, il vous restera %.2f euros apres vos depenses \n", this.differenceMontantBudget);
        } else if (budget > montant) {
            this.differenceMontantBudget = this.montant - this.budget;
            this.differenceMontantBudget= Math.abs(this.differenceMontantBudget);
            System.out.printf(" Il vous manque %.2f euros pour partir en vacance\n", this.differenceMontantBudget);
        }
    }
}

