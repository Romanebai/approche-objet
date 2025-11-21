package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class RecherchePopulationVille {

    public void traiter(Recensement recensement, Scanner scanner) throws IOException {
        System.out.println("Entrer le nom de la ville.");
        String nom = scanner.nextLine();

        List<Ville> villes = recensement.getVilles();
        Ville villeTrouve = null;

        for (Ville ville : villes) {
            if (ville.getNomCommune().equalsIgnoreCase(nom)) {
                villeTrouve = ville;
                break;
            }
        }

            if  (villeTrouve != null) {
                System.out.println("La ville que vous avez choisi est : " + villeTrouve.getNomCommune() + " et sa population totale : " + villeTrouve.getPopTotale());
            } else {
                System.out.println("Cette ville est introuvable.");
            }

    }
}
