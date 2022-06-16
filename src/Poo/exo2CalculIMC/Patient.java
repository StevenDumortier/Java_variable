package Poo.exo2CalculIMC;

public class Patient {
    private String firstName;
    private String lastName;
    private String pays;
    private boolean married;
    private int nombreEnfant;
    private float taille;
    private float poids;

    public Patient(String firstName, String lastName, String pays, boolean married, int nombreEnfant,float taille,float poids){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pays = pays;
        this.married = married;
        this.nombreEnfant=nombreEnfant;
        this.taille=taille;
        this.poids=poids;
    }
    public Patient(String firstName, String lastName, String pays,float taille,float poids){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pays = pays;
        this.married = false;
        this.nombreEnfant=0;
        this.taille=taille;
        this.poids=poids;
    }
    public Patient(String firstName, String lastName, float taille,float poids){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pays = "";
        this.married = false;
        this.nombreEnfant=0;
        this.taille=taille;
        this.poids=poids;}

    public Patient(float taille,float poids){
        this.firstName = "";
        this.lastName = "";
        this.pays = "";
        this.married = false;
        this.nombreEnfant=0;
        this.taille=taille;
        this.poids=poids;}

    public float IMC(){ return (float)poids/(float)Math.pow(taille,2);}

    public String toString(){

        return String.format(
        ("Prenom : " +firstName)+
        ("\nNom : " +lastName)+
       ("\nPays : " +pays)+
        ("\nMarié : " +(married?"oui":"non"))+
        ("\nNombre d'enfant : " +nombreEnfant)+
        ("\nTaille : " +taille)+
        ("\nPoids : " +poids));
    }

    //Les getters
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public String getPays(){
        return this.pays;
    }
    public boolean getMarried(){
        return this.married;
    }
    public int getNombreEnfant(){return this.nombreEnfant;}
    public float getTaille(){return this.taille;}
    public float getPoids(){return this.poids;}

    //Les setters
    public void setFirstName(String firstName){this.firstName=firstName;}
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setPays(String pays){
        this.pays=pays;
    }
    public void setMarried(boolean married){
        this.married=married;
    }
    public void setNombreEnfant(int nombreEnfant){
        this.nombreEnfant=nombreEnfant;
    }
    public void setTaille(float taille){this.taille=taille;}
    public void setPoids(float poids){this.taille=taille;}
}
