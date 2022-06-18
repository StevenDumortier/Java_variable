package TpEvaluation17_06_22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class tp7TableauCaractereAfficheSuccesionMaj {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Character> tabLettre = new ArrayList<>();
        ArrayList<Character> tabLettreMaj = new ArrayList<>();

        int i = 0;
        char lettre;

        while (true){

            System.out.print("Donnez une lettre, si vous avez termine appuye sur ',' : ");
            lettre = input.next().charAt(0);
            lettre = Character.toLowerCase(lettre);

            if (lettre == ',')
            {
                break;
            }

            tabLettre.add(lettre);

            if (i%2 == 0) {
                lettre = Character.toUpperCase(lettre);
            }
            i++;
            tabLettreMaj.add(lettre);

//                tabLettre.put(i,tabLettre.get(i))
            }
        System.out.println(tabLettre);
        System.out.println(tabLettreMaj);




    }
}

