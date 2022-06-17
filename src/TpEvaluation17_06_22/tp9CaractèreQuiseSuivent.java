package TpEvaluation17_06_22;

import java.util.Scanner;

public class tp9CaractèreQuiseSuivent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Rentrez un nom : ");
        String nom = input.nextLine();
        boolean repetition = true;
        for (int i=0; i<=nom.length();i++){

            if (nom.charAt(i) == nom.charAt(i+1))
            {
                System.out.println("true");
                System.exit(1);
            }
            if (i == nom.length()-2)
                break;
        }
        System.out.println("false");
    }
}
