package TpEvaluation17_06_22.tp11BibliothèqueReussi;

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
        System.out.printf("La bibliotheque %s est ouverte\n",nomBibliotheque);
    }

    public String getNomBibliotheque() {
        return nomBibliotheque;
    }

    public int getNbExemplaires() {
        return nbExemplaires;
    }
    public void stocker(Exemplaire exemplaire, int nbExemplaires ){
        this.nbExemplaires=nbExemplaires;
        this.exemplaire=exemplaire;
        for (int i = 1;i<=nbExemplaires;i++){
            System.out.println(exemplaire);
        exemplaires.add(exemplaire);}
    }
    public void stocker(Exemplaire exemplaire){
        this.nbExemplaires=1;
        this.exemplaire=exemplaire;
        for (int i = 1;i<=nbExemplaires;i++){
            exemplaires.add(exemplaire);}
    }

    public void listerExemplaires(){
        for (int i = 0;i<exemplaires.size();i++) {
            System.out.println(exemplaires.get(i));
        }
    }
    public void compterExemplaires(Oeuvre oeuvre){
        this.oeuvre = oeuvre;
        int compteur=0;
        for (int i = 0;i<exemplaires.size();i++) {

        if(exemplaires.get(i).getOeuvre().getTitre()==oeuvre.getTitre()){
            compteur++;}
        }
        System.out.println(oeuvre +"dispose de " + compteur + " exemplaires");
    }


    public void afficheAuteur(boolean price) {
        ArrayList<String> tabAuteur = new ArrayList<>();
        for (int i = 0; i < exemplaires.size(); i++) {
            if (price == true) {
                if (exemplaires.get(i).getOeuvre().auteur.isPrime()==true) {
                    tabAuteur.add(exemplaires.get(i).getOeuvre().getNomAuteur());
                }
            } else if (price == false) {
                    tabAuteur.add(exemplaires.get(i).getOeuvre().getNomAuteur());
                }
            }
        for (int j = 0; j < tabAuteur.size(); j++) {
            System.out.println(tabAuteur.get(j));
        }

    }

}
