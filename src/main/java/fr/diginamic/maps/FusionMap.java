package fr.diginamic.maps;

import java.util.HashMap;

public class FusionMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");

        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");

        HashMap<Integer, String> map3 = new HashMap<>();
        map3.putAll(map1);
        map3.putAll(map2);


        System.out.println("----- Les clés de ma map 3 -----");
        for (Integer keyVille : map3.keySet()) {
            System.out.println(keyVille);
        }

        System.out.println("----- Les valeurs de ma map 3 -----");
        for (String nomVille : map3.values()) {
            System.out.println(nomVille);
        }

    }
}
