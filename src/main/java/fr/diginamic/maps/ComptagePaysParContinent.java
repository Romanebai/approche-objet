package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        ArrayList<Pays> comptage = new ArrayList<>();
        comptage.add(new Pays("France", 65, "Europe"));
        comptage.add(new Pays("Allemagne", 80, "Europe"));
        comptage.add(new Pays("Belgique", 10, "Europe"));
        comptage.add(new Pays("Russie", 150, "Asie"));
        comptage.add(new Pays("Chine", 1.4, "Asie"));
        comptage.add(new Pays("Indonésie", 220, "Océanie"));
        comptage.add(new Pays("Australie", 20, "Océanie"));

        HashMap<String, Integer> comptagePays = new HashMap<>();

        for (int i = 0; i<comptage.size();i++) {
            Pays pays = comptage.get(i);
            String continent =  pays.getContinent();

            Integer compteur = comptagePays.get(continent);
            if (compteur == null) {
                compteur = 0;
            }
            compteur++;
            comptagePays.put(continent, compteur);
        }

        Set<String> continents = comptagePays.keySet();

        Iterator<String> iterator = continents.iterator();
        while (iterator.hasNext()) {
            String continent = iterator.next();
            Integer compteur = comptagePays.get(continent);

            System.out.println("Continent: " + continent +  " - Pays: " + compteur);
        }


    }
}
