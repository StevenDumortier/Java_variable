import java.util.Scanner;
public class exo12Les10NombreAuDessus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int numero = input.nextInt();
        for (int i = 1; i<=10;i++)
        {
            numero++;
            System.out.print(numero+" ");
        }
    }


}
