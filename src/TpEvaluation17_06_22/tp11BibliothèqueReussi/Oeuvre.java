package TpEvaluation17_06_22.tp11BibliothèqueReussi;

public class Oeuvre {
    private String titre;
    private String langue;

    Auteur auteur;

    public Oeuvre(String titre,Auteur auteur,String langue){
        this.auteur = auteur;
        this.titre = titre;
        this.langue = langue;
    }

    public Oeuvre(String titre, Auteur auteur ,boolean prime) {
        this.auteur=auteur;
        this.titre = titre;
        this.langue = "francais";
    }

    public String getTitre() {
        return this.titre;
    }

    public String getNomAuteur(){
        return this.auteur.getNom();
    }
    public String getLangue() {
        return this.langue;
    }

    @Override
    public String toString() {
        return "Oeuvre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur.nom + '\'' +
                ", langue='" + langue + '\'' +
                '}';
    }
}
