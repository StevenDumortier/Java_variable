package Poo.exo1ClassPersonne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Personne steven = new Personne();

        System.out.print("fist name : ");
        steven.firstName=input.nextLine();

        System.out.print("last name : ");
        steven.lastName=input.nextLine();

        System.out.print("Pays : ");
        steven.pays=input.nextLine();

        System.out.print("married true or false : ");
        steven.married=input.nextBoolean();

        System.out.print("nombre d'enfant : ");
        steven.nombreEnfant=input.nextInt();

        System.out.println(steven.nomComplet());

        steven.message();
    }
}
