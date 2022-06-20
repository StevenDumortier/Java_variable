package TpEvaluation17_06_22.tp12Souris;

public class Souris  {
    private int poids;
    private int age;
    private String couleur;
    private int esperanceVie;
    private boolean clonee;


    private Souris souris;


    public Souris(int poids, int age, String couleur, int esperanceVie) {
        this.poids = poids;
        this.age = age;
        this.couleur = couleur;
        this.esperanceVie = esperanceVie;
        this.clonee=false;
        System.out.println("Une nouvelle souris !");
    }

    public Souris(int poids, String couleur, int esperanceVie) {
        this.poids = poids;
        this.couleur = couleur;
        this.esperanceVie = esperanceVie;
        this.age = 0;
        this.clonee=false;
        System.out.println("Une nouvelle souris !");
    }

    public Souris(Souris souris) {
        this.souris = souris ;
        this.age = souris.age;
        this.couleur = souris.couleur;
        this.esperanceVie = souris.esperanceVie * (4/5);
        this.poids = souris.poids;
        this.clonee = true;
        System.out.println("Une nouvelle souris clonee !");
    }



        public Souris(int poids, int age, String couleur) {
            this.poids = poids;
            this.age = age;
            this.couleur = couleur;
            this.esperanceVie=36;
            this.clonee=false;
            System.out.println("Une nouvelle souris !");

    }
//    public Souris clone(Souris souris){
//        Souris sourisClone = souris;
//        sourisClone.esperanceVie=(4/5)*souris.esperanceVie;
//        System.out.println("Clonage dune souris !");
//        try{
//            sourisClone = (Souris) super.clone();
//        }
//        catch(CloneNotSupportedException cnse) {
//            cnse.printStackTrace(System.err);
//    }
//
//        return sourisClone;
//    }



    public void setEsperanceVie(int esperanceVie) {
        this.esperanceVie = esperanceVie;
    }

    public int getEsperanceVie() {
        return esperanceVie;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        String cloneeText = clonee ? ", [clonee], " : "";
        return  "Une Souris " + couleur + cloneeText + " de "+ age + "mois et pesant " + poids + " grammes";
}

    public void vieillir(Souris souris){
        this.souris=souris;
        this.souris.setAge(this.souris.getAge()+1);
        if (souris.clonee ==true && souris.getEsperanceVie()/2 <=souris.getAge()){
            souris.setCouleur("verte");
        }

    }
    public void evolue(Souris souris){
        souris.setAge(souris.getEsperanceVie());
    }

}
