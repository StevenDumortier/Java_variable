package Poo;

public class Rectangle { //class
    double longueur; //Attribue ou variable
    double largeur;

    double calculDeLaSurface(){  //methode
        return longueur*largeur;
    }

    double calculDuPerimetre(){
        return 2*(longueur+largeur);
    }
}
