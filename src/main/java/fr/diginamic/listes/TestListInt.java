package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListInt {
    public static void main(String[] args) {
        ArrayList<Integer> entiers = new ArrayList<>();
        entiers.add(-1);
        entiers.add(5);
        entiers.add(7);
        entiers.add(-2);
        entiers.add(4);
        entiers.add(8);
        entiers.add(5);

        System.out.println("Voici mon tableau : " + entiers);
        System.out.println("La taille de mon tableau est de : " + entiers.size());

        int max = Collections.max(entiers);
        System.out.println("Le nombre le plus grand de ma liste est : " + max);

        int min = Collections.min(entiers);
        System.out.println("Le nombre le plus petit de ma liste est : " + min);

        entiers.remove(Integer.valueOf(min));
        System.out.println("Voici mon tableau après suppression: " + entiers);

        for (int i = 0; i < entiers.size(); i++) {
            if (entiers.get(i) < 0) {
                System.out.println("j'ai trouvé celui-ci qui est négatif : " + entiers.get(i));
                entiers.set(i , Math.abs(entiers.get(i)));
            }
        }
        System.out.println("Voici mon tableau après modification des négatifs : " + entiers);
    }
}
