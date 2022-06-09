import java.util.Scanner;
public class exo11Factorielle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Donnez un nombre entier a calculer :");
        int numero = input.nextInt();
        while (numero<0)
        {
            System.out.print("Veuillez saisir un nombre entier positif : ");
            numero = input.nextInt();
        }
        if (numero == 0)
        {
            System.out.print("Factorielle de " +numero+ " c'est : 1");
        }
        else
        {
            int reponse = 1;
            System.out.print("Factorielle de " +numero+ " c'est : 1");
            for (int i = 2; i<=numero;i++)
            {
                reponse*=i;
                System.out.print(" x " + i);
            }
            System.out.print(" = " + reponse );
        }
    }
}
