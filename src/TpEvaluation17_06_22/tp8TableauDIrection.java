package TpEvaluation17_06_22;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class tp8TableauDIrection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        int y = 0;

        String direction;
        while (true) {
            System.out.print("Donnez une direct, Haut, Bas,Droite,Gauche, sinon tapé juste entree quand vous avez terminez :");
            direction = input.nextLine();
//            direction = direction.toLowerCase();
//            direction = direction.replaceAll("\\s", "");
            if (direction.equals("")) {
                break;}
            else if (direction.equals("haut") )
            {
                y++;
                System.out.println("salut");
            }
            else if (direction.equals("bas"))
            {
                y--;
            }
            else if (direction.equals("gauche"))
            {
                x--;
            }
            else if (direction.equals("droite") )
            {
                x++;
            }
        }
        int[] position = {x, y};
        System.out.println(Arrays.toString(position));
    }
}

