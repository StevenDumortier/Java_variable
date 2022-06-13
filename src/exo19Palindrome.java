import java.util.Scanner;

public class exo19Palindrome {
    public static void main(String[] args) {
        Scanner inport = new Scanner(System.in);
        System.out.print("Affichez le nom : ");
        String nomInverser ="";
        String nom = inport.nextLine();
        for (int i = nom.length()-1;i>=0;i--){
            nomInverser += nom.charAt(i);
            }
        if (nom.equals(nomInverser))
        {
            System.out.println("Le nom " + nom + " est bien un Palindrome ");
        }
        else
        {
            System.out.println("Le nom " + nom + " n'est pas un Palindrome");
        }
    }
}
