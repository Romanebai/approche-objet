package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        Path recens = Paths.get("/Users/rohmane/Downloads/recensement.csv");

        ArrayList<Ville> villes = new ArrayList<>();

        List<String> lines = Files.readAllLines(recens);
        lines.removeFirst();

        for (String line : lines) {

            String[] tokens = line.split(";");
            String nom = tokens[6];
            String departement = tokens[2];
            String nomRegion = tokens[1];
            int popTotale = Integer.parseInt(tokens[9].replace(" ", ""));

            if (popTotale > 25000) {
                Ville ville = new Ville(nom, departement, nomRegion, popTotale);
                villes.add(ville);
            }
        }

        Collections.sort(villes);

        for (Ville ville : villes) {
            System.out.println(ville);
        }





    }
}
