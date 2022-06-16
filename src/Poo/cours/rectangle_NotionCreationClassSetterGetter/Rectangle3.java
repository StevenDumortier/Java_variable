package Poo.cours.rectangle_NotionCreationClassSetterGetter;

public class Rectangle3 {

    private double longueur; //Attribue ou variable
    private double largeur;
//Surcharge : La possibilité d'avoir au sein d'une classe plusieurs méthodes(constructeur)
    // avec le même nom mais différentes signatures
   public Rectangle3(double longueur,double largeur) {
       this.longueur=longueur;
       this.largeur=largeur;
   }

    public Rectangle3(){ //constructeur par defaut defini par defaut,
       longueur=5;         //si il y a un constructeur comme ici
       largeur=10;     //le constructeur défaut par défaut n'existe plus
    }



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

    public String toString(){
        return String.format("[ Longueur : %f\nLargeur : %f\nSurface : %f\nPerimètre %f" +
                        " ]",
                this.longueur,this.largeur,this.calculDeLaSurface(),this.calculDuPerimetre());
    }
}




