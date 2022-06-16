package Poo.exo3CreationDeVehicule;

public class Main {
    public static void main(String[] args) {
        Camion camion1 = new Camion(2000,50);
        System.out.println(camion1);

        Voiture voiture1 = new Voiture(2000,50);
        voiture1.demarrer();

        System.out.println(voiture1);
    }

}
