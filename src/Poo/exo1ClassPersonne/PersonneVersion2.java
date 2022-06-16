package Poo.exo1ClassPersonne;

public class PersonneVersion2 {
    private String firstName;
    private String lastName;
    private String pays;
    private boolean married;
    private int nombreEnfant;

public PersonneVersion2(String firstName, String lastName, String pays, boolean married, int nombreEnfant){
    this.firstName = firstName;
    this.lastName = lastName;
    this.pays = pays;
    this.married = married;
    this.nombreEnfant=nombreEnfant;
}

// Les getters
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getPays(){
        return pays;
    }
    public boolean getMarried(){
        return married;
    }
    public int getNombreEnfant(){return nombreEnfant;}

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
    void message() {
        String estMarie =married?"Vous etes marrie":"Vous n'etes pas marrie";
        System.out.printf("Bonjour %s %s,Vous venez de la %s , %s , Vous avez %d enfant",firstName,lastName,pays,estMarie,nombreEnfant);
    }
    String nomComplet(){
        return (firstName + " " + lastName);
    }
}
