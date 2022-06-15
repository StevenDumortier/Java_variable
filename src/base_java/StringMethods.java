package base_java;

public class StringMethods {
    public static void main(String[] args) {
        //afficher ou selectionner un caractère d'un string
        String nom="Maeva";
        System.out.println(nom.charAt(2));

        // Parcourir d'un string caractère par caractère
        System.out.println("Itération sur les charactères\n ==========================");
        for(int i=0;i<nom.length();i++)
        {
            System.out.println(nom.charAt(i));
        }
        // variable.intexOf() : Retourn la première occurence de l'index du caractère passé en argument
        System.out.println(nom.indexOf('a'));

        //remplacement des caractères
        String nom2="abracadabra";
        System.out.println(nom2.replace('a','*'));

        // Extraire une sous-chaine : Christian Lisangola
        String chaine = "Christian Lisangola";
        String chaine2 = chaine.substring(0,9); //[0;9[
        System.out.println(chaine2);

    }
}
