package fr.diginamic.maps;

import java.util.HashMap;

public class CreationEtManipulationMap {
    public static void main(String[] args) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");


            System.out.println("----- Les clés de ma map -----");
        for (Integer keyVille : mapVilles.keySet()) {
            System.out.println(keyVille);
        }

            System.out.println("----- Les valeurs de ma map -----");
        for (String nomVille : mapVilles.values()) {
            System.out.println(nomVille);
        }



        int taille = mapVilles.size();
        System.out.println("------------------------");
        System.out.println("Taille de la map : " + taille);
    }
}
