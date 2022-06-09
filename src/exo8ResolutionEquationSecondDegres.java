import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class exo8ResolutionEquationSecondDegres {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Saisir a : ");
        float a = input.nextFloat();

        System.out.print("Saisir b : ");
        float b = input.nextFloat();

        System.out.print("Saisir c : ");
        float c = input.nextFloat();

        double delta;
        delta = Math.pow(b,2)-4*a*c;

        if (delta<0)
        {
            System.out.println("Il n'y a pas de valeur réelle");
        }
        else if (delta==0)
        {
            double x0 = (-b)/(2*a);
            System.out.printf("Le discriminant vaut %f L'unique solution est %f",delta,x0);
        }
        else
        {
            double x1 = ((-b)-(Math.sqrt(delta)))/(2*a);
            double x2 = ((-b)+(Math.sqrt(delta)))/(2*a);
            System.out.printf("Le discriminant vaut %f Les solutions sont %f et %f",delta,x1,x2);
        }

    }

}
