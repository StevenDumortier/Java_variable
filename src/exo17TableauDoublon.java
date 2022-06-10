import java.util.Scanner;
public class exo17TableauDoublon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String valeurSomme = "S = ";
        System.out.print("Combien voulez vous de valeurs dans le tableau : ");
        int nombreValeur = input.nextInt();
        int[] tableau = new int[nombreValeur];
        for (int i = 0; i <= tableau.length - 1; i++) {
            System.out.print("Donnez la valeur numero " + (i + 1) + " du tableau : ");
            tableau[i] = input.nextInt();

        }
        System.out.print("Donnez un nombre a rechercher dans le tableau : ");
        int nombreRepetition = input.nextByte();
        byte repetition=0;
        for (int i : tableau)
        {
            if (tableau[i-1]==nombreRepetition)
            {
                repetition++;
            }
        }
        if (repetition==0)
        {
            System.out.println(nombreRepetition + " n'est pas dans le tableau");
            System.exit(1);
        }
        System.out.println("Le tableau contient "+repetition+ " fois le numero "+ nombreRepetition);
    }
}