package TpEvaluation17_06_22;

import java.util.Scanner;

public class tp2InverseNombre {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Rentrez un nombre : ");
        int nombre = input.nextInt();
        String nombreInverse = "";
        if (nombre<0){
            nombre = Math.abs(nombre);
            nombreInverse ="-";
        }
        String nombreEnString;
        nombreEnString = String.valueOf(nombre);

        int nombreInverseInt;
                for (int i=nombreEnString.length()-1; i>=0;i--)
                {
                    nombreInverse+=nombreEnString.charAt(i);
                }
                nombreInverseInt = Integer.parseInt(nombreInverse);
        System.out.println("Le nombre "+nombreEnString+" a pour inverse "+ nombreInverseInt);
    }
}
