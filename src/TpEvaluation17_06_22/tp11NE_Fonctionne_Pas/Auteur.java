package TpEvaluation17_06_22.tp11NE_Fonctionne_Pas;

public class Auteur {
    protected String nomAuteur;
    private boolean prime;

    public Auteur(String nomAuteur,boolean prime) {
        this.nomAuteur = nomAuteur;
        this.prime = prime;
    }

    public String getNom() {
        return nomAuteur;
    }

    public boolean isPrime() {
        return prime;
    }

}
