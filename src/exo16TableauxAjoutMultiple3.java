import java.util.Scanner;
public class exo16TableauxAjoutMultiple3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int somme=0;
        String valeurSomme = "S = ";
        System.out.print("Combien voulez vous de valeurs dans le tableau 1 : ");
        int nombreValeur = input.nextInt();
        int[] tableau1 = new int[nombreValeur];
        System.out.print("Combien voulez vous de valeurs dans le tableau 2 : ");
        nombreValeur = input.nextInt();
        int[] tableau2 = new int[nombreValeur];
        System.out.print("Combien voulez vous de valeurs dans le tableau 3 : ");
        nombreValeur = input.nextInt();
        int[] tableau3 = new int[nombreValeur];
        for (int i = 0; i <= tableau1.length - 1; i++) {
            System.out.print("Donnez la valeur numero " + (i+1) + " du premier tableau : ");
            tableau1[i] = input.nextInt();
            if (tableau1[i] % 3 == 0)
            {
                somme+=tableau1[i];
                String convertir = Integer.toString(tableau1[i])+" + ";
                valeurSomme += convertir;
            }
        }
        for (int i = 0; i <= tableau2.length - 1; i++) {
            System.out.print("Donnez la valeur numero " + (i+1) + " du deuxième tableau : ");
            tableau2[i] = input.nextInt();
            if (tableau2[i] % 3 == 0)
            {
                somme+=tableau2[i];
                String convertir = Integer.toString(tableau2[i])+" + ";
                valeurSomme += convertir;
            }
        }
            for (int i = 0; i <= tableau3.length - 1; i++) {
                System.out.println("Donnez la valeur numero " + (i+1)  + " du troisieme tableau : ");
                tableau3[i] = input.nextInt();
                if (tableau3[i] % 3 == 0) {
                    somme+=tableau3[i];
                    String convertir = Integer.toString(tableau3[i])+" + ";
                    valeurSomme += convertir;
                }
            }
            valeurSomme = valeurSomme.substring(0,valeurSomme.length()-3);
            System.out.println(valeurSomme +" = "+ somme);

        }
    }

