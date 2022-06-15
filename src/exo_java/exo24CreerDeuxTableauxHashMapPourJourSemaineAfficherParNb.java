package exo_java;//import jdk.internal.icu.text.UnicodeSet;

import java.util.*;

public class exo24CreerDeuxTableauxHashMapPourJourSemaineAfficherParNb {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> jourDeLeSemaine = new ArrayList<>();
        String jour;

        for(int i =1; i<=7;i++) {
            System.out.printf("Afficher le jour %d de la semaine : ",i);
            jour = input.nextLine();
            jour = jour.replaceAll("\\s+", "");
            jourDeLeSemaine.add(jour);
        }

        ArrayList<Integer> numeroDuJourDeLaSemaine = new ArrayList<>();
        int nombreDuJour;

        for(int i =1; i<=7;i++) {
            System.out.printf("Afficher le nombre correspondant a %s : ",jourDeLeSemaine.get(i-1));
            nombreDuJour = input.nextInt();

            if (nombreDuJour < 1 || nombreDuJour > 7) {
                System.out.println(numeroDuJourDeLaSemaine);
                System.out.println("Ce nombre n'est pas approprié pour les jours de la semaine, le tableau a été vidé pour que vous recommencez");
                numeroDuJourDeLaSemaine.removeAll(numeroDuJourDeLaSemaine);
                System.out.println(numeroDuJourDeLaSemaine);
                i=0;
                continue;
            }

            numeroDuJourDeLaSemaine.add(nombreDuJour);
        }

        System.out.println("Affichage du tableau des jours de la semaine\n" +jourDeLeSemaine + "\nAffichage des numero de la semaine\n" + numeroDuJourDeLaSemaine);
        HashMap<Integer, String> HashSemaine = new HashMap<>();
        for (int i = 0; i < numeroDuJourDeLaSemaine.size(); i++) {
                    HashSemaine.put(numeroDuJourDeLaSemaine.get(i), jourDeLeSemaine.get(i));
                }
        int id;
        while(true){
            System.out.println("Saisir le numero du jour, sinon pour quitter note 0");
            id=input.nextInt();
            if (id == 0)
            {
                System.exit(1);
            }
            System.out.println(HashSemaine.get(id));
        }

    }

}

//        System.out.println("ok");
//        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
//        UnicodeSet arrayList;
//        if (hashSet.add(Integer)) arrayList.add(E);
