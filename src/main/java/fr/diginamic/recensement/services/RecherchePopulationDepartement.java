package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class RecherchePopulationDepartement {

    public void traiter(Recensement recensement, Scanner scanner) throws IOException {
        System.out.println("Entrer le numéro d'un département : ");
        String departement = scanner.nextLine();

        List<Ville> villes = recensement.getVilles();

        int popDepartement = 0;
        for (Ville ville : villes) {
            if (ville.getCodeDepartement().equalsIgnoreCase(departement)) {
                popDepartement += ville.getPopTotale();
            }
        } if  (popDepartement > 0) {
            System.out.println("La population totale pour le département : " + departement + " est égale à " +  popDepartement);
        } else {
            System.out.println("Ce département est introuvable.");
        }
    }
}
