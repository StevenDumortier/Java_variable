package Poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//        String nom = "coucou@gmail.com";
//        String nom2;
//        nom2 = nom.substring(nom.indexOf('@')+1,nom.length());
//        System.out.println(nom2);
//
//        ArrayList<Integer> tableau = new ArrayList<>(Arrays.asList(14,15,16));
//        tableau.add(25);
//        System.out.println(tableau);
        Scanner input = new Scanner(System.in);

        System.out.println("Donnez une lettre, si vous avez terminé appuyé sur entrée");
        char lettre = input.next().charAt(0);
        System.out.println(lettre);
    }
}