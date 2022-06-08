public class ConditionIntro {
    public static void main(String[] args) {
        // Declaration de la variable age
        byte age = 17;
        //Test condition
        //si age>=18 alors affiche un message "vous etes majeur, et pouvez donc participer à la compétition"
        //fin si
        //Sinon Afficher "vous etes mineur et ne pouvez pas participer à la compétition"
        if (age>=18)
        {
            System.out.println("vous etes majeur et pouvez donc participer à la compétition");
        }
        else
        {
            System.out.println("vous etes mineur et ne pouvez pas participer à la compétition");
        }


        String pays ="France";
        if(pays=="France")
        {
            System.out.println("Bonjour");
        }
        else if (pays=="Allemagne")
        {
            System.out.println("Guten Tag");
        }
        else if (pays=="Espagne")
        {
            System.out.println("Hola");
        }
        else if (pays=="Chine")
        {
            System.out.println("MIAO");
        }
        else
        {
            System.out.println("Le pays n'est pas supporte");
        }
    }
}
