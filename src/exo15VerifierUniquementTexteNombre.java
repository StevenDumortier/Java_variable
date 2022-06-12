import java.util.Scanner;
public class exo15VerifierUniquementTexteNombre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez votre code PIN : ");
        String codePIN = input.nextLine();

        for (int i = 0; i <= codePIN.length()-1; i++)
        {
            if (!Character.isDigit(codePIN.charAt(i)))
            {
                i=-1;
                System.out.println("Vous avez saisi une lettre, recommencez avec uniquement des nombres");
                codePIN = input.nextLine();
            }
        }
        System.out.println("Vous avez saisi que des nombres");
        System.exit(1);
    }

}

