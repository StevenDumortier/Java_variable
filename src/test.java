public class test {
    public static void main(String[] args) {
        String nom = "coucou@gmail.com";
        String nom2;
        nom2 = nom.substring(nom.indexOf('@')+1,nom.length());
        System.out.println(nom2);


    }
}
