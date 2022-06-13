import java.util.Scanner;
public class exo18SaisirUnTexteEtAfficheLInverse {
    public static void main(String[] args) {
        Scanner inport = new Scanner(System.in);
        System.out.print("Affichez le nom : ");
        String nomAInverser = inport.nextLine();
        for (int i = nomAInverser.length()-1;i>=0;i--){
            System.out.print(nomAInverser.charAt(i));
        }
    }
}

