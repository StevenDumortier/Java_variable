package Poo.exo1ClassPersonne;

public class MainVersion2 {
    public static void main(String[] args) {
        PersonneVersion2 steven = new PersonneVersion2("Steven","Dumoriter","France",false,0);


        System.out.println(steven.nomComplet());

        steven.message();
        System.out.println("");
        steven.setFirstName("Georges");
        steven.setNombreEnfant(2);
        steven.message();
    }
}

