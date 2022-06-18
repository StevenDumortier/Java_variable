package TpEvaluation17_06_22.tp11Bibliotheque;

public class Oeuvre extends Auteur {
    private String titre;
    private String langue;

    public Oeuvre(String titre, String nomAuteur,String langue) {
        super(nomAuteur);
        this.titre = titre;
        this.langue=langue;
    }

    public Oeuvre(String nomAuteur, String titre) {
        super(nomAuteur);
        this.titre = titre;
        this.langue = "francais";
    }

    String nomAuteur;

    public String getTitre() {
        return titre;
    }

    public String getNomAuteur(){
        return nomAuteur;

    }


    public String getLangue() {
        return langue;
    }

    @Override
    public String toString() {
        return "Oeuvre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + nomAuteur + '\'' +
                ", langue='" + langue + '\'' +
                '}';
    }
}
