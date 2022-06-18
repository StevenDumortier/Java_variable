package TpEvaluation17_06_22.tp10Tirelire.VersionObjet;

public class Main {
    public static void main(String[] args) {

        double montant = 150;
        Bank sous=new Bank();
        System.out.print(sous.secouer());;
        System.out.println(sous.getMontant());
        double papy=50;
        sous.remplir(papy);
        System.out.print(sous.secouer());
        System.out.println(sous.getMontant());
        sous.calculerSolde();
        System.out.println(sous);
        sous.puiser(10);
        System.out.println(sous);
        sous.vider();
        System.out.println(sous.getMontant());


    }
}
