package TpEvaluation17_06_22.tp11NE_Fonctionne_Pas;

import java.util.ArrayList;

public class Bibliothèque {
    private String nomBibliotheque;

    private String titre;
    private ArrayList<Exemplaire> exemplaires = new ArrayList<>();

    private Exemplaire exemplaire;
    private int nbExemplaires = exemplaires.size();
    private boolean price;
    private Oeuvre oeuvre;

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
    public void stocker(Exemplaire exemplaire,int nbExemplaires ){
        this.nbExemplaires=nbExemplaires;
        this.exemplaire=exemplaire;
        for (int i = 1;i<=nbExemplaires;i++)
        exemplaires.add(exemplaire);
    }
    public void stocker(Exemplaire exemplaire){
        this.nbExemplaires=1;
        this.exemplaire=exemplaire;
        for (int i = 1;i<=nbExemplaires;i++)
            exemplaires.add(exemplaire);
    }

    public void listerExemplaires(){
        for (int i = 0;i<=exemplaires.size();i++) {
            System.out.print("Un exemplaire de ");
            System.out.print(exemplaires.get(i).getTitre());
            System.out.print(exemplaires.get(i).getNomAuteur());
            System.out.print(exemplaires.get(i).getLangue());
        }
    }
    public void compterExemplaires(Oeuvre oeuvre){
        this.oeuvre = oeuvre;
        int compteur=0;
        for (int i = 0;i<exemplaires.size();i++) {
        if(exemplaires.get(i).getTitre().equals(oeuvre.getTitre())){
            compteur++;}
        }
        System.out.println(oeuvre +"dispose de " + compteur + " exemplaires");
    }
    public void afficheAuteur(boolean price) {
        ArrayList<String> tabAuteur = new ArrayList<>();
        for (int i = 0; i < exemplaires.size(); i++) {
            if (price = true) {
                if (!tabAuteur.contains(exemplaires.get(i).isPrime())) {
                    tabAuteur.add(exemplaires.get(i).getNomAuteur());
                }
            } else if (price = false) {
                if (!tabAuteur.contains(exemplaires.get(i).getNomAuteur())) {
                    tabAuteur.add(exemplaires.get(i).getNomAuteur());
                }
            }


        }
    }

}
