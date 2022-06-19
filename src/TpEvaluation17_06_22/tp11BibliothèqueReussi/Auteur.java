package TpEvaluation17_06_22.tp11BibliothèqueReussi;

public class Auteur {
    protected String nom;
    private boolean prime;

    public Auteur(String nom,boolean prime) {
        this.nom = nom;
        this.prime = prime;
    }

    public String getNom() {
        return this.nom;
    }

    public boolean isPrime() {
        return this.prime;
    }

}
