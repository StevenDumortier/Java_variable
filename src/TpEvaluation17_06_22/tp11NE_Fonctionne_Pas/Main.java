package TpEvaluation17_06_22.tp11NE_Fonctionne_Pas;

public class Main {
    public static void main(String[] args) {
        Bibliothèque steven = new Bibliothèque("steven");
        Auteur auteur1= new Auteur("Alexendre Dumas",true);
        Oeuvre oeuvre1 = new Oeuvre("Le Comte de Monte-Cristo","Alexendre Dumas",true,"Anglais");
        Exemplaire exemplaire1=new Exemplaire("Le Comte de Monte-Cristo","Alexendre Dumas",true,"Anglais",false);
        Exemplaire exemplaire2=new Exemplaire("Le Comte de Monte-Cristo","Alexendre Dumas",true,"Anglais",true);
        steven.stocker(exemplaire2,6);
        steven.compterExemplaires(oeuvre1);

    }
}
