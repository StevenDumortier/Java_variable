package TpEvaluation17_06_22;

import java.util.Scanner;

public class tp2InverseNombre {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Rentrez un nombre :");
        String nombre = input.nextLine();

        String nombreInverse = "";
        int nombreInverseInt;
                for (int i=nombre.length()-1; i>=0;i--)
                {
                    nombreInverse+=nombre.charAt(i);
                }
                nombreInverseInt = Integer.parseInt(nombreInverse);
        System.out.println("Le nombre "+nombre+" a pour inverse "+ nombreInverseInt);
    }
}
