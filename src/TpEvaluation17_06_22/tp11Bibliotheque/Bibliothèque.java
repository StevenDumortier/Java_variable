package TpEvaluation17_06_22.tp11Bibliotheque;

import java.util.ArrayList;

public class Bibliothèque {
    private String nomBibliotheque;
    private ArrayList<String> exemplaires = new ArrayList<>();
    private int nbExemplaires = exemplaires.size();

    public Bibliothèque(String nomBibliotheque) {
        this.nomBibliotheque = nomBibliotheque;
        System.out.printf("La bibliotheque %s est ouverte",nomBibliotheque);
    }

    public String getNomBibliotheque() {
        return nomBibliotheque;
    }

    public int getNbExemplaires() {
        return nbExemplaires;
    }
    public void stocker(){

    }

}
