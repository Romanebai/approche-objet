package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Top10VillesRegion {
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Entrer le nom d'une région pour avoir les 10 villes les plus peuplées : ");
        String region = scanner.nextLine();

        List<Ville> villes = recensement.getVilles();
        List<Ville> regions = new ArrayList<>();

        for (Ville ville : villes) {
            if (ville.getNomRegion().equalsIgnoreCase(region)) {
                regions.add(ville);
            }
        }
        Collections.sort(regions);

        for (int i = 0; i < 10 && i < regions.size(); i++) {
            System.out.println(regions.get(i).getNomCommune() + " " + regions.get(i).getPopTotale());
        }

    }
}
