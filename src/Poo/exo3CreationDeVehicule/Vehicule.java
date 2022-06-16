package Poo.exo3CreationDeVehicule;

public abstract class Vehicule {
    private static int nombreVehicule = 0;
    private int matricule;
    private int anneeDuModele;
    private int prix;

    public Vehicule(int anneeDuModele, int prix) {
        this.nombreVehicule++;
        this.matricule=this.nombreVehicule;
        this.anneeDuModele = anneeDuModele;
        this.prix = prix;
    }

    public Integer getMatricule() {
        return matricule;
    }

    public int getAnneeDuModele() {
        return anneeDuModele;
    }
    public void setAnneeDuModele(int anneeDuModele) {
        this.anneeDuModele = anneeDuModele;
    }

    public int getPrix() {
        return prix;
    }
    public void setPrix(int prix) {
        this.prix = prix;
    }

    public abstract void demarrer();
    public abstract void accelerer();

    @Override
    public String toString() {
        return  "matricule=" + matricule +
                ", anneeDuModele=" + anneeDuModele +
                ", prix=" + prix +
                '}';

    }
}


