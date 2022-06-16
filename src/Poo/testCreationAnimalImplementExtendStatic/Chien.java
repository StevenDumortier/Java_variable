package Poo.testCreationAnimalImplementExtendStatic;

public class Chien extends Animal{

    public Chien(byte esperenceDeVie,byte nombreDePattes){
        super(esperenceDeVie,nombreDePattes);
    }
    @Override
    public void race(
    ) {
        System.out.println("Chien");
    }
}
