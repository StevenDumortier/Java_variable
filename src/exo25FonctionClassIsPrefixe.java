public class exo25FonctionClassIsPrefixe {
    static boolean IsPrefix(String nom,String prefixe){
        if (nom.length()<=prefixe.length()){
            System.out.println("erreur, le nom possede plus de caractere que le prefixe");
            return false;
        }
        nom = nom.substring(0,prefixe.length());
        boolean IsPrefix = nom.equals(prefixe);
        return IsPrefix;

    }
    public static void main(String[] args) {
        boolean test1 = IsPrefix("nomnom","nom");
        System.out.println(test1);
    }
}
