package Poo.testCreationAnimalImplementExtendStatic;

public class Licorne extends Animal implements IVoler{

    public Licorne(byte nombreDePattes, byte esperenceDeVie) {
        super(nombreDePattes, esperenceDeVie);
    }

    @Override
    public void race() {
        System.out.println("licorne");
    }

    @Override
    public void vol() {
        System.out.println("Je vole");
    }
}
