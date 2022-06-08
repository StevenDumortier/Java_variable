public class Variables {
    public static void main(String[] args) {
        // Les variable en Java sont en camelCase
        // Les classes vont être en PascalCase

        //Les entiers
        byte age=18;

        //Calcul Rectangle
        int longueur = 50;
        int largeur = 25;
        int surface = longueur*largeur;
        int perimetre = 2*(longueur + largeur);
        System.out.println("La surface du rectangle est de " +surface+ " et le périmètre est de " + perimetre);

        // calcul de la vitesse moyenne en MRU
        float distanceParcourue=90.6F;
        float temps = 12.354F;
        double vitesseMoyenne=distanceParcourue/temps;
        //calcul somme des nombres
        float nombre1 = 150.5F;

        // chaine de caracteres et caracters
        String prenom="Steven"; // chaine de caracteres
       // char genre = m;
    }
}
