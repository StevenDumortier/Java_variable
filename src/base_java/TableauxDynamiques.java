package base_java;

import java.util.ArrayList;

public class TableauxDynamiques {
    public static void main(String[] args) {
        ArrayList<Integer> notes=new ArrayList();

        ArrayList<String> langageDeProgrammation=new ArrayList<>();
        System.out.println("Taille du tableau : "+langageDeProgrammation.size());

        langageDeProgrammation.add("Java");
        langageDeProgrammation.add("Python");
        langageDeProgrammation.add("C++");
        langageDeProgrammation.add("Fortran");
        langageDeProgrammation.add("Visual Basic 6.0");


        System.out.println("Taille du tableau : "+langageDeProgrammation.size());
        System.out.printf("langageDeProgrammation [%d] : %s\n",0,langageDeProgrammation.get(0));

        System.out.println("Tableau avant suppression");
        System.out.println(langageDeProgrammation);

        System.out.println("Tableau après suppression");
        langageDeProgrammation.remove(4);
        System.out.println(langageDeProgrammation);

        System.out.println("Renommer Python en Python 3.7");
        langageDeProgrammation.set(1,"Python 3.7");

        // Tester si le tableau est vide
        //if (langageDeProgrammation.isEmpty())
        if(langageDeProgrammation.size()==0){
            System.out.println("Le tableau est vide");
        }
        // Parcourir un tableau dynamique
        for(int i=0;i<langageDeProgrammation.size();i++){
            System.out.printf("element %d : %s",i,langageDeProgrammation.get(i));
        }

        // Vider un tableau
        langageDeProgrammation.clear();
    }
}
