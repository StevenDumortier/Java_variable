import javax.swing.*;
import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int [] nombres=new int[3];
        nombres[0]=12;
        nombres[1]=15;
        nombres[2]=20;
        System.out.println("Afficher tableau nombre1 :" + Arrays.toString(nombres));

        int [] nombres2=nombres;
        nombres2[0]=33;

        System.out.println("Affichage tableau nombre1 après création de nombre 2 : " + Arrays.toString(nombres));

        if (nombres==nombres2)
        {
            System.out.println("Les 2 tableaux pointent vers un meme tableau");
        }
        int [] nombres3 = new int [3];
        nombres[0]=33;
        nombres[1]=15;
        nombres[2]=20;
        System.out.println(" Affichage nombre 3 : " + Arrays.toString(nombres3));
        if (nombres == nombres2)
        {
            System.out.println("Nombre et nombre3 pointent vers le même tableau");
        }
        else{
            System.out.println("nombre et nombre 3 ne poitent pas vers le même tableau");
        }
        String tableauNombre1 =Arrays.toString(nombres);

}

}
