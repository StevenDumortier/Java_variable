package base_java;

import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        // type apporté  nonDeLaVariable =
        Scanner input = new Scanner(System.in);
        System.out.println("Bonjour");
        System.out.print("Votre nom : ");
        String nom=input.nextLine();
        System.out.print("Votre prenom : ");
        String prenom=input.nextLine();
        System.out.print("Votre genre : ");
        char genre=input.next().charAt(0);
        System.out.print("Votre age : ");
        byte age=input.nextByte();
        System.out.print("Votre poids : ");
        float poids=input.nextFloat();
        System.out.printf("Vous vous appelez %s %s, vous êtes un %c et vous avez %d ans. Poids %.2f kg\n",prenom,nom,genre,age,poids);
    }
}
