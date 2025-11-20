package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Departement;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Top10Departements {
    public void traiter(Recensement recensement, Scanner scanner) throws IOException {

        List<Ville> villes = recensement.getVilles();
        List<Departement> departements = new ArrayList<>();

        for (Ville ville : villes) {
            Departement departement = null;
            for (Departement depart : departements) {
                if (depart.getCodeDepartement().equals(ville.getCodeDepartement())) {
                    departement = depart;
                    break;
                }
            }
            if (departement != null) {
                departement.setPopulationDepartement(departement.getPopulationDepartement()+ville.getPopTotale());
            } else  {
                Departement nouveauDepart = new Departement(ville.getCodeDepartement(), ville.getPopTotale());
                departements.add(nouveauDepart);
            }
        }

        Collections.sort(departements);
        System.out.println("----- Le top 10 des départements les plus peuplées -----");
        for (int i = 0; i<10 && departements.size()>i; i++) {
            System.out.println("Département " + departements.get(i).getCodeDepartement() + " pour " + departements.get(i).getPopulationDepartement() + " habitants. ");
        }




    }
}
