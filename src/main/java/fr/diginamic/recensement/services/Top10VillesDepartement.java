package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.*;

public class Top10VillesDepartement {
    public void traiter (Recensement recensement, Scanner scanner) {
        System.out.println("Entrer le numéro d'un département pour avoir les 10 villes les plus peuplées : ");
        String departement = scanner.nextLine();

        List<Ville> villes = recensement.getVilles();
        List<Ville> villeDepartements = new ArrayList<>();

        for  (Ville ville : villes) {
            if (Objects.equals(departement, ville.getCodeDepartement())) {
                villeDepartements.add(ville);
            }
        }
        Collections.sort(villeDepartements);

        for (int i = 0; i < 10 && i < villeDepartements.size(); i++) {
            System.out.println(villeDepartements.get(i).getNomCommune() + " - " + villeDepartements.get(i).getCodeDepartement()+ " - " + villeDepartements.get(i).getPopTotale() + " habitants.");
        }

    }
}
