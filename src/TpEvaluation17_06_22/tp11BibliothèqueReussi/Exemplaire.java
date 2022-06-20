package TpEvaluation17_06_22.tp11BibliothèqueReussi;

public class Exemplaire {

    private Oeuvre oeuvre;
//    private boolean copie;

    public Exemplaire(Oeuvre oeuvre) {
        this.oeuvre=oeuvre;
//        this.copie=copie;
//        if(copie)
            System.out.printf("Première exemplaire -> %s, de %s, en %s \n",this.oeuvre.getTitre(),this.oeuvre.getNomAuteur(),this.oeuvre.getLangue());
//        else if(!copie)
//            System.out.printf("Exemplaire -> %s, de %s, en %s \n",this.oeuvre.getTitre(),this.oeuvre.getNomAuteur(),this.oeuvre.getLangue());
    }
    public Exemplaire(Exemplaire exemplaire){
        this.oeuvre = exemplaire.oeuvre;
    System.out.printf("Copie exemplaire -> %s, de %s, en %s \n",this.oeuvre.getTitre(),this.oeuvre.getNomAuteur(),this.oeuvre.getLangue());
}
    public Oeuvre getOeuvre(){
        return oeuvre;
    }

    @Override
    public String toString() {
        return "Un Exemplaire{" +
                ", de titre='" + this.oeuvre.getTitre() + '\'' +
                "auteur='" + this.oeuvre.getNomAuteur() + '\'' +
                ", langue='" + this.oeuvre.getLangue() + '\'' +
                '}';
    }
}
