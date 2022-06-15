package base_java;

public class TableauATailleFixe {
    public static void main(String[] args) {
        float [] notesPhysique={17.5F,18.2F,19,9,12};//Taille 5
        float [] notesMath=new float[5];//{0.0,0.0,0.0,0.0,0.0}

        //Acces à la table afficher le premier ici 17
        System.out.println(notesPhysique[0]);

        //Acces avec boucle
        for(int i=0;i<=notesPhysique.length-1;i++)
        {
            System.out.println(notesPhysique[i]);
        }
        //Calcul de la moyenne des notes
        float sommeDesNotes=0;
        for(int i=0;i<=notesPhysique.length-1;i++)
        {
            sommeDesNotes+=notesPhysique[i];

        }
        System.out.println("Somme des notes "+sommeDesNotes);
        System.out.println("Moyenne des notes "+sommeDesNotes/notesPhysique.length);
    }
}
