package exo_java;

import java.util.Scanner;
public class exo7PairImpairNul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez un numéro : ");
        int numero = input.nextInt();

        if (numero % 2 == 0)
        {
            if (numero < 0)
            {
                System.out.printf("Le numéro %d est négatif et pair", numero);
            }
            else if (numero > 0)
            {
                System.out.printf("Le numéro %d est positif et pair", numero);
            }
            else
            {
                System.out.printf("Le numéro %d est nul et est pair", numero);
            }
        }
        else
        {
            if (numero < 0)
            {
                System.out.printf("Le numéro %d est négatif et impair", numero);
            }
            else if (numero > 0)
            {
                System.out.printf("Le numéro %d est positif et impair", numero);
            }
            else
            {
                System.out.printf("Le numéro %d est nul et est pair", numero);
            }
        }

    }
}
