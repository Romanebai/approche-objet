package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        // Avec la concaténation : 1249 ms
        // Avec le builder : 10 (sans affichage : 3)
        long debut = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= 100000; i++) {
           builder.append(i);
        }
        //System.out.println(builder.toString());


        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
    }
}
