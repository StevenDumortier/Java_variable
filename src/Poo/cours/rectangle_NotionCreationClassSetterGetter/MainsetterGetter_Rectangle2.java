package Poo.cours.rectangle_NotionCreationClassSetterGetter;

public class MainsetterGetter_Rectangle2 {
    public static void main(String[] args) {

Rectangle2 Rectangle2 = new Rectangle2();
        System.out.println("***********");
        System.out.println("**Objet 1**");
        System.out.println("************\n");
        Rectangle2 terrain = new Rectangle2();
        System.out.println("Etat inital de l'objet après " +
                "création\n======================");
        System.out.println("La longueur : " + terrain.getLongueur());
        System.out.println("La largeur : " + terrain.getLargeur());

        System.out.println("Etat de l'objet après avoir fourni des " +
                "valeur\n==========================");
        terrain.setLongueur(500);
        terrain.setLargeur(350);
        System.out.println("La longueur : " + terrain.getLongueur());
        System.out.println("La largeur : " + terrain.getLargeur());
        System.out.println("Surface : " + terrain.calculDeLaSurface());
        System.out.println("Perimète : " + terrain.calculDuPerimetre());
    }
}
