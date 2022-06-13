import java.util.ArrayList;
import java.util.Scanner;

public class exo23RemplirTableauMailPourcentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Combien de mail aura votre tableau : ");
        int nbAdresseMail = input.nextInt();
        input.nextLine();
        ArrayList<String> listeMail = new ArrayList<>();
        String mail;
        String mailPourCompter;
        float gmail,yahoo,hotmail;
        gmail = yahoo = hotmail = 0.0F;
        for(int i=0; i<nbAdresseMail;i++){
            System.out.print("Entrez le mail numero " + (i+1) + " : ");
            mail = input.nextLine();
            listeMail.add(mail);
            mailPourCompter = mail.substring(mail.length()-9,mail.length());
            if (mailPourCompter.endsWith("gmail.com")) {
                gmail += 1;
            }
            if (mailPourCompter.endsWith("yahoo.com")) {
                yahoo += 1;
            }
            if (mailPourCompter.endsWith("otmail.fr")) {
                hotmail+=1;
            }
            if (mailPourCompter.endsWith("@yahoo.fr")) {
                yahoo += 1;
            }

            }
        System.out.printf("Repartion de :\n gmail : %.2f\n yahoo : %.2f\n hotmail : %.2f",(gmail*100)/(gmail+hotmail+yahoo),(yahoo*100)/(gmail+hotmail+yahoo),(hotmail*100)/(gmail+hotmail+yahoo));


        }


    }
