package TpEvaluation17_06_22.tp11NE_Fonctionne_Pas;

public class Exemplaire extends Oeuvre  {

    private Oeuvre oeuvre;
    private boolean copie;
    private String langue;

    private String nomAuteur;

    public Exemplaire(String titre, String nomAuteur,boolean prime, String langue,boolean copie) {
        super(titre,nomAuteur,prime,langue);
        this.copie=copie;
        if(copie)
            System.out.printf("Nouvelle exemplaire -> %s, %s, en %s \n",titre,nomAuteur,langue);
        else if(copie)
            System.out.printf("Nouvelle exemplaire -> %s, %s, en %s \n",titre,nomAuteur,langue);
    }


    public Oeuvre getOeuvre(){
        return oeuvre;
    }

    @Override
    public String toString() {
        return "Un Exemplaire{" +
                ", de titre='" + oeuvre + '\'' +
                "auteur='" + nomAuteur + '\'' +
                ", langue='" + langue + '\'' +
                '}';
    }
}
