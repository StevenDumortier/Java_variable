package exo_java;

public class exo1Age {
    public static void main(String[] args) {
        int age = 25;
        if (age>=7 && age<=9)
        {
            System.out.println("Catégorie Poussin");
        }
        else if (age == 10 || age ==11)
        {
            System.out.println("Catégorie Pupille");
        }
        else if (age == 12 || age ==13)
        {
            System.out.println("Catégorie Benjamin");
        }
        else if (age == 14 || age ==15)
        {
            System.out.println("Catégorie Minime");
        }
        else if (age == 16 || age ==17)
        {
            System.out.println("Catégorie Pupille");
        }
        else
        {
            System.out.println("L'age n'entre dans aucune catégorie");
        }
    }
}
