package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Top10VillesFrance {
    public void traiter(Recensement recensement, Scanner scanner) {
        List<Ville> villes = recensement.getVilles();
        Collections.sort(villes);
        for (int i = 0; i < 10 &&  i < villes.size(); i++) {
            System.out.println(villes.get(i).getNomCommune() + " " + villes.get(i).getPopTotale());
        }
    }
}
