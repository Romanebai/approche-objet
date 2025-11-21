package fr.diginamic.maps;
import fr.diginamic.listes.Ville;

import java.util.HashMap;

public class MapVilles {
    public static void main(String[] args) {
        HashMap<String, Ville> mapVille = new HashMap<>();
        mapVille.put("Nice", new Ville("Nice", 343000));
        mapVille.put("Carcassonne", new Ville("Carcassonne", 47800));
        mapVille.put("Narbonne", new Ville("Narbonne", 53400));
        mapVille.put("Lyon", new Ville("Lyon", 484000));
        mapVille.put("Foix", new Ville("Foix", 9700));
        mapVille.put("Pau", new Ville("Pau", 77200));
        mapVille.put("Marseille", new Ville("Marseille", 850700));
        mapVille.put("Tarbes", new Ville("Tarbes", 40600));

        String villeMoins = null;
        int nbrHab = Integer.MAX_VALUE;


        for (String key : mapVille.keySet()) {
            Ville ville = mapVille.get(key);

            if (ville.getNbrHabitant() < nbrHab) {
                nbrHab = ville.getNbrHabitant();
                villeMoins = key;
            }
        }
        mapVille.remove(villeMoins);
           // System.out.println(villeMoins);

            for (Ville ville : mapVille.values()) {
                System.out.println(ville);
            }



    }
}
