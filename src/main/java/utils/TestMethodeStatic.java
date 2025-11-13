package utils;

public class TestMethodeStatic {
    public static void main(String[] args) {
        String chaine = "77";
        int result = Integer.parseInt(chaine);
        System.out.println("La valeur de chaine est : " + result);

        int a = 3;
        int b = 6;

        System.out.println("La valeur la plus grande est : " + Integer.max(a,b));
    }
}
