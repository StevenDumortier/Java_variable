package Poo.testCreationAnimalImplementExtendStatic;

public class Chat extends Animal{
    public Chat(byte nombreDePattes, byte esperenceDeVie) {
        super(nombreDePattes, esperenceDeVie);
    }

    @Override
    public void race() {
        System.out.println("Chat");
    }
}
