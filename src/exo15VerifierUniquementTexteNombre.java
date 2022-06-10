import java.util.Scanner;
public class exo15VerifierUniquementTexteNombre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int o = 0;
        System.out.print("Entrez votre code PIN : ");
        String codePIN = input.nextLine();
        while (true)
        {
            for (int i = 0; i <= codePIN.length()-1; i++)
            {
                if (Character.isDigit(codePIN.charAt(i)) == true)
                {
                    o++;
                }
                else if (Character.isDigit(codePIN.charAt(i)) == false)
                {
                    o = 0;
                    System.out.println("Vous avez saisi une lettre, recommencez avec uniquement des nombres");
                }
                if (o == codePIN.length())
                {
                    System.out.println("Vous avez saisi que des nombres");
                    break;
                }
            }
            codePIN = input.nextLine();
        }







    }
}
