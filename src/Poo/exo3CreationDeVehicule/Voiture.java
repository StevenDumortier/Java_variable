package Poo.exo3CreationDeVehicule;

public class Voiture extends Vehicule  {

    public Voiture(int anneeDuModele, int prix) {
        super(anneeDuModele, prix);
    }

    @Override
    public void demarrer() {
        System.out.println("Vroom");
    }

    @Override
    public void accelerer() {
        System.out.println("Vrooooooom!!!!!");
    }
}
