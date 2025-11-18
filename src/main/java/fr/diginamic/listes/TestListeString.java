package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> villes = new ArrayList<>();
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        System.out.println("Villes : " + villes);

        String max = villes.getFirst();
        for (int i = 1; i < villes.size(); i++) {
            if (villes.get(i).length() > max.length()) {
                max = villes.get(i);
            }
        }
        System.out.println("Max : " + max);

        villes.removeIf(ville -> ville.startsWith("N"));
        System.out.println("Villes : " + villes);
    }
}
