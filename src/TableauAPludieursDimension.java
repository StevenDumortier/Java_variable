import java.util.Arrays;

public class TableauAPludieursDimension {
    public static void main(String[] args) {
//        int[] a={1,2,3,4,5};
//        int[] a2=new int[5];

      //affichage sans boucle
        int[][] nombres={{1,2,6,5},{2,4,9},{7,3}};
       //Premier tableau
        System.out.println(nombres[0][0]);
        System.out.println(nombres[0][1]);
        System.out.println(nombres[0][2]);
        System.out.println(nombres[0][3]);
//Deuxieme tableau
        System.out.println(nombres[1][0]);
        System.out.println(nombres[1][1]);
        System.out.println(nombres[1][2]);
//Troisieme tableau
        System.out.println(nombres[2][0]);
        System.out.println(nombres[2][1]);

        //Affichage avec boucle for
        for(int i=0;i< nombres.length;i++) {
            System.out.println(Arrays.toString(nombres[i]));
            for(int j=0;j<nombres[i].length;j++)
            {
                System.out.println(nombres[i][j]);
            }
        }
    }
}
