public class Affichage {
    public static void main(String[] args) {
        String nom="Christian Lisangola";
        char genre='M';
        byte age=12;
        float poids=25.53F;
        boolean estMarie=false;
        System.out.println("Vous vous appelez " +nom+", vous avez " +age+" ans. Poids : "+poids+ " kg");

//         %s pour texte (string),%c (pour char) %d nb ss virgule (byte,integer)  %f nb à virgule (float,double)
//         %.1f  pour afficher un seul nombre après la virgule, %.2f affiché 2 nb après ,
        System.out.printf("Vous vous appelez %s, vous avez %d ans. Poids %.1f kg\n",nom,age,poids);

        // Avec operateur ternaire
        System.out.printf("Vous vous appelez %s, vous avez %d ans. Poids %.1f kg et vous %s\n",nom,age,poids,estMarie?"etes marie":"n'etes pas marie");

        //Sans operateur ternaire
        String etatMarie=estMarie? "etes marie":"n'etes pas marie";
        System.out.printf("Vous vous appelez %s, vous avez %d ans. Poids %.1f kg et vous %s",nom,age,poids,etatMarie);
    }
}
