package Poo.testCreationAnimalImplementExtendStatic;

public class Creation {
    public static void main(String[] args) {
Chien dog=new Chien((byte) 20, (byte) 4);
Chat cat=new Chat((byte)15,(byte)4);
        System.out.println(dog);
        System.out.println(cat);
        Chien dog2=new Chien((byte) 20,  (byte)4);
        System.out.println(dog2);
    }
}
