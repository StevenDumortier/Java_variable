package Poo.exo1ClassPersonne;

class Personne {
    String firstName;
    String lastName;
    String pays;
    boolean married;
    int nombreEnfant;


    void message() {
        String estMarie =married?"Vous etes marrie":"Vous n'etes pas marrie";
        System.out.printf("Bonjour %s %s,Vous venez de la %s , %s , Vous avez %d enfant",firstName,lastName,pays,estMarie,nombreEnfant);
    }
    String nomComplet(){
        return (firstName + " " + lastName);
    }
}
