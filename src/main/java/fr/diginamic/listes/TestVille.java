package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestVille {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<Ville>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        Ville maxPeuple = villes.getFirst();
        for (int i = 1; i < villes.size(); i++) {
            if (villes.get(i).getNbrHabitant() > maxPeuple.getNbrHabitant()) {
                maxPeuple = villes.get(i);
            }
        }
        System.out.println("La ville la plus peuplée est : " + maxPeuple);

        Ville minPeuple = villes.getFirst();
        for (int i = 1; i < villes.size(); i++) {
            if (villes.get(i).getNbrHabitant() < minPeuple.getNbrHabitant()) {
                minPeuple = villes.get(i);
            }
        }
        System.out.println("La ville la moins peuplée est : " + minPeuple);
        villes.remove(minPeuple);
        System.out.println(villes);

        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).getNbrHabitant() > 100000) {
                villes.get(i).setNom(villes.get(i).getNom().toUpperCase());
            }
        }
        System.out.println(villes);







    }
}
