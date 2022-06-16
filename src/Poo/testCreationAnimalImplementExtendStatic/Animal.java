package Poo.testCreationAnimalImplementExtendStatic;

public abstract class Animal {
    private byte nombreDePattes;
    private byte esperenceDeVie;
    private static byte compteur = 1;
    private byte matriculeAnimal;

    public Animal(byte nombreDePattes,byte esperenceDeVie){
        this.nombreDePattes=nombreDePattes;
        this.esperenceDeVie=esperenceDeVie;
        this.matriculeAnimal =this.compteur;
        this.compteur++;
    }

    public void setNombreDePattes(byte nombreDePattes) {
        this.nombreDePattes = nombreDePattes;
    }
    public byte getNombreDePattes(){
        return this.nombreDePattes;
    }

    public byte getEsperenceDeVie() {
        return this.esperenceDeVie;
    }

    public void setEsperenceDeVie(byte esperenceDeVie) {
        this.esperenceDeVie = esperenceDeVie;
    }

    public byte getMatriculeAnimal() {
        return this.matriculeAnimal;
    }
    public abstract void race();

    public static byte nombreAnimal(){
        return compteur;
    }

    @Override
    public String toString() {
        return  "{" +
                "nombreDePattes=" + nombreDePattes +
                ", esperenceDeVie=" + esperenceDeVie +
                ", matriculeAnimal=" + matriculeAnimal +
                '}';
    }
}
