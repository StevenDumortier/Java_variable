import java.util.ArrayList;
import java.util.Scanner;

public class exo23RemplirTableauMailPourcentage {
    public static void main(String[] args) {

        String mail;
        float gmail, yahoo, hotmail;
        gmail = yahoo = hotmail = 0.0F;
        Scanner input = new Scanner(System.in);
        ArrayList<String> listeMail = new ArrayList<>();

        System.out.print("Combien de mail aura votre tableau : ");
        int nbAdresseMail = input.nextInt();
        input.nextLine();

        for (int i = 0; i < nbAdresseMail; i++) {
            System.out.print("Entrez le mail numero " + (i + 1) + " : ");
            mail = input.nextLine();
            listeMail.add(mail);

            if (mail.endsWith("gmail.com")) {
                gmail += 1;
            }
            else if (mail.endsWith("yahoo.com")||mail.endsWith("yahoo.fr")) {
                yahoo += 1;
            }
            else if (mail.endsWith("hotmail.fr")) {
                hotmail += 1;
            }
        }
            System.out.printf("Repartion de :\n gmail : %.2f\n yahoo : %.2f\n hotmail : %.2f", (gmail * 100) / (gmail + hotmail + yahoo), (yahoo * 100) / (gmail + hotmail + yahoo), (hotmail * 100) / (gmail + hotmail + yahoo));


        }

    }

