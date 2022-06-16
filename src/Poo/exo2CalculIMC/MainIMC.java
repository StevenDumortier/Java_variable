package Poo.exo2CalculIMC;

public class MainIMC {
    public static void main(String[] args) {
        Patient david = new Patient ("David","David","France",1.65f,55.3f);
        System.out.println(david);
        david.setPoids(50.6f);
        System.out.println("IMC : " + david.IMC());
        Patient marc = new Patient(1.35f,30);

        System.out.println("IMC : " + marc.IMC());
    }
}
