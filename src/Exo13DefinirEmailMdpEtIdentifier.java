import java.util.Scanner;
public class Exo13DefinirEmailMdpEtIdentifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Definissez votre email : ");
        String email = input.nextLine();
        System.out.println("Votre email à été défini");
        System.out.println("Definissez votre MDP : ");
        String mdp = input.nextLine();
        System.out.println("Votre mdp a ete defini");
        while (true)
        {
            System.out.println("Saisissez votre email");
            String email2 = input.nextLine();
            System.out.println("Saisissez votre mdp");
            String mdp2 = input.nextLine();
            if (!email.equals(email2))
            {
                System.out.println("Error, email invalide");
                continue;
            }
            else if (!mdp.equals(mdp2))
            {
                System.out.println("Error, mdp invalide");
                continue;
            }
            System.out.println("Bienvenu dans votre espace client ");
            break;
        }

    }
}
