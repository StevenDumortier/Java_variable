package Poo.cours.rectangle_NotionCreationClassSetterGetter;
//Quand on ne fournit pas un constructeur
//Le compilateur Java invoque un constructeur spécial appelé
//"Le constructeur par défaut par défaut"
public class Rectangle2 { //class
    private double longueur; //Attribue ou variable
    private double largeur;

    //Accesseur ou Getter : Ce sont des méthodes qui nous donnent un accès en lecture
    // aux membres ou attributs privés
    public double getLongueur(){
        return longueur;
    }

    public double getLargeur(){
        return largeur;
    }
    //Manipulateurs ou setters : Ce sont des méthodes qui nous donnent la possibilité
    // de modifier des attributs privés

    public void setLongueur(double longueur){
        this.longueur=longueur;
    }

    public void setLargeur(double largeur){
        this.largeur=largeur;
    }
    double calculDeLaSurface(){  //methode
        return longueur*largeur;
    }

    double calculDuPerimetre(){
        return 2*(longueur+largeur);
    }
}
