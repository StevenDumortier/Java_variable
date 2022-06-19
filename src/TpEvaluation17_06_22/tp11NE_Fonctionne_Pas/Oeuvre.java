package TpEvaluation17_06_22.tp11NE_Fonctionne_Pas;

public class Oeuvre extends Auteur {
    private String titre;
    private String langue;

    private Auteur auteur;

    private String nomAuteur;

    public Oeuvre(String titre,String nomAuteur, boolean prime,String langue){
        super(nomAuteur, prime);
        this.titre = titre;
        this.langue = langue;
    }

    public Oeuvre(String titre, String nomAuteur,boolean prime) {
        super(nomAuteur,prime);
        this.titre = titre;
        this.langue = "francais";
    }

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
