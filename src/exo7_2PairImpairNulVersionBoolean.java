import java.util.Scanner;
public class exo7_2PairImpairNulVersionBoolean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tapez un nombre : ");
        int nombre = input.nextInt();
        boolean estPair = nombre%2==0;
        boolean estPositif = nombre>=0;
        String paireImpaire = estPair?"est paire":"est impaire";
        String positifNegatif = estPositif?"est positif":"est négatif";
        System.out.printf("Le nombre %d %s et %s",nombre,paireImpaire,positifNegatif);
    }
}
