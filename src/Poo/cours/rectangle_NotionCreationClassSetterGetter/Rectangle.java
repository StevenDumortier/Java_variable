package Poo.cours.rectangle_NotionCreationClassSetterGetter;

public class Rectangle {
    double longueur;
    double largeur;
    double calculDeLaSurface(){
        return longueur*largeur;
    }

    double calculDuPerimetre(){
        return 2*(longueur+largeur);
    }

}

