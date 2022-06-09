import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class exo8ResolutionEquationSecondDegres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Saisir a");
        float a = input.nextFloat();
        System.out.print("Saisir b");
        float b = input.nextFloat();
        System.out.print("Saisir c");
        float c = input.nextFloat();
        float delta;
        delta = Math.pow(b,2)-4*a*c;
        if (delta<0)
        {
            System.out.println("Il n'y a pas de valeur réelle");
        }
        if (delta=0)
        {
            float x0 = (-b)/2*a;
            System.out.printf("L'unique solution est %f",x0);
        }
        else
        {
            Double x1 = (-b)-(Math.sqrt(delta)/(2*a));
            Double x2 = (-b)-(Math.sqrt(delta)/(2*a));
            System.out.printf("Les solutions sont %f et %f",x1,x2);
        }

    }

}
