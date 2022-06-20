package TpEvaluation17_06_22.tp11BibliothèqueReussi;

public class Main {
    public static void main(String[] args) {
        Bibliothèque steven = new Bibliothèque("steven");
        Auteur auteur1= new Auteur("Alexendre Dumas",true);
        Auteur auteur2= new Auteur("Christian",false);
        Oeuvre oeuvre1 = new Oeuvre("Le Comte de Monte-Cristo",auteur1,"Anglais");
        Oeuvre oeuvre2 = new Oeuvre("java",auteur2,"Francais");
        Exemplaire exemplaire2=new Exemplaire(oeuvre1);
        Exemplaire exemplaire4=new Exemplaire(exemplaire2);
        Exemplaire exemplaire3=new Exemplaire(oeuvre2);
        steven.stocker(exemplaire2,6);
        steven.stocker(exemplaire3,3);
        steven.compterExemplaires(oeuvre1);
        steven.compterExemplaires(oeuvre2);
        steven.afficheAuteur(false);
//        steven.afficheAuteur(false);
        steven.listerExemplaires();
    }
}
