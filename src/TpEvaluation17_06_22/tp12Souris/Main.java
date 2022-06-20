package TpEvaluation17_06_22.tp12Souris;

public class Main {
    public static void main(String[] args) {
        Souris souris1 = new Souris(25,20,"blanche",30);
        Souris souris1Clonee = new Souris(souris1);
        System.out.println(souris1);
        System.out.println(souris1Clonee);
        souris1Clonee.vieillir(souris1Clonee);
        System.out.println(souris1Clonee);
        souris1.evolue(souris1);
        System.out.println(souris1);
    }

}
