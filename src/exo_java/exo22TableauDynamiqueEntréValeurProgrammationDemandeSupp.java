package exo_java;

import java.util.ArrayList;
import java.util.Scanner;

public class exo22TableauDynamiqueEntréValeurProgrammationDemandeSupp {
    public static void main(String[] args) {
        ArrayList<String> langageDeProgrammation = new ArrayList();
        String nomDuLangage;
        Scanner input = new Scanner(System.in);
        System.out.print("Combien de langage de programmation voulez-vous rentrer ? ");
        int nbDeLangage = input.nextInt();
        input.nextLine();

        for (int i =0; i<nbDeLangage; i++){
            System.out.print("Entrez le nom numero " + i + " : ");
            nomDuLangage = input.nextLine();
            langageDeProgrammation.add(nomDuLangage);
        }

        while (true)
        {
            System.out.println(langageDeProgrammation);
            System.out.println("Si vous désiez supprimer un langage de la liste, ecrivez le nom. Sinon tapez [non]");
            String nomASupprimer = input.nextLine();
            if (nomASupprimer.equals("non")){
                System.out.println("Votre liste vous convient");
                break;}
            for (int i = 0;i<langageDeProgrammation.size();i++) {

                if (nomASupprimer.equals(langageDeProgrammation.get(i))){
                    langageDeProgrammation.remove(i);
                    System.out.println(langageDeProgrammation);
                }

            }
        }
    }
}
