package TpEvaluation17_06_22;

import java.util.Arrays;

public class tp1CreationTableauAfficheMinMax {
    public static void main(String[] args) {
        int [] nombre = {12,3,5,6,-3};
        int max = nombre[0];
        int min = nombre[0];
        for (int i = 0;i<nombre.length;i++) {
            if (max < nombre[i])
                max = nombre[i];
            if (min > nombre[i])
                min = nombre[i];
        }
        System.out.print("Tableau [ ");

        for (int i = 0;i<nombre.length;i++) {
            System.out.print(", "+nombre[i]);

            if (nombre[i]==min)
            System.out.print("(PP)");
            if (nombre[i]==max)
            System.out.print("(PG)");
        }
        System.out.print("]");
//        System.out.println(Arrays.toString(nombre));
//        System.out.println("min : " + min + "\nmax : " + max);

        }
    }
