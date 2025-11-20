package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Region;
import fr.diginamic.recensement.Ville;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Top10Regions {
    public void traiter(Recensement recensement, Scanner scanner) throws IOException {
        //Afficher les 10 régions les plus peuplées

        //récupérer la liste
        List<Ville> villes = recensement.getVilles();
        List<Region> regions = new ArrayList<>();

        //trier les régions les plus peuplées
        //afficher les 10 premières
        for (Ville ville : villes) {
            Region regionExistante = null;
                for (Region reg : regions) {
                    if (reg.getNomRegion().equalsIgnoreCase(ville.getNomRegion())) {
                        regionExistante = reg;
                        break;
                    }
                }
                if (regionExistante != null) {
                regionExistante.setPopulationRegion(regionExistante.getPopulationRegion() + ville.getPopTotale());
                } else {
                Region nouvelleRegion =  new Region(ville.getCodeRegion(), ville.getNomRegion(), ville.getPopTotale());
                regions.add(nouvelleRegion);
                }
            }


        Collections.sort(regions);
        System.out.println("---- Le top 10 des régions les plus peuplées ----");
        for (int i = 0; i < 10 && i < regions.size(); i++) {
                System.out.println(regions.get(i).getNomRegion() + " pour " + regions.get(i).getPopulationRegion() + " habitants.");
        }



    }
}
