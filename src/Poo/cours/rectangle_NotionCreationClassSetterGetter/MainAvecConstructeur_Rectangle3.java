package Poo.cours.rectangle_NotionCreationClassSetterGetter;

public class MainAvecConstructeur_Rectangle3 {
    public static void main(String[] args) {
        System.out.println("***********");
        System.out.println("**Objet 1**");
        System.out.println("************\n");
        Rectangle3 terrain=new Rectangle3(500,350);
        System.out.println("Etat inital de l'objet après " +
                "création\n======================");
        System.out.println("La longueur : "+terrain.getLongueur());
        System.out.println("La largeur : "+terrain.getLargeur());

        System.out.println("Etat de l'objet après avoir fourni des " +
                "valeur\n==========================");
    }



}
