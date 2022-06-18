package TpEvaluation17_06_22.tp11Bibliotheque;

public class Auteur {
    protected String nomAuteur;
    private boolean prime;

    public Auteur(String nom) {
        this.nomAuteur = nom;
        this.prime = prime;
    }

    public String getNom() {
        return nomAuteur;
    }

    public boolean isPrime() {
        return prime;
    }

}
