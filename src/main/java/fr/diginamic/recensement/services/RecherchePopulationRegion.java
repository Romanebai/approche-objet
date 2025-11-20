package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulationRegion {

    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Entrer le nom de la région");
        String region = scanner.nextLine();

        List<Ville> villes = recensement.getVilles();

        int popRegion = 0;

        for  (Ville ville : villes) {
            if (ville.getNomRegion().equalsIgnoreCase(region)) {
                popRegion += ville.getPopTotale();
            }
        }

        if (popRegion > 0 ) {
            System.out.println("La région que vous avez choisit est : " + region + " et sa population totale est : " + popRegion);
        } else {
            System.out.println("Cette région est introuvable.");
        }
    }
}
