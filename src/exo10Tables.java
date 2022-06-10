import java.util.Scanner;
public class exo10Tables {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez la première table : ");
        int tableDebut = input.nextInt();
        System.out.print("Entrez la dernière table : ");
        int tableFin = input.nextInt();
        System.out.print("Entrez le nombre a partir duquel vous voulez que la table commence : ");
        int iDebut = input.nextInt();
        System.out.print("Entrez le nombre a partir duquel vous voulez que la table se termine : ");
        int iFin = input.nextInt();
        for (int i = tableDebut; i<=tableFin;i++ )
        {
            System.out.println("");
            System.out.println("Table de "+i);
            for (int j = iDebut; j<=iFin;j++)
            {
                System.out.println(i + " x " + j + " = " + (i*j));
            }

        }
    }
}