package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recensement {
        private List<Ville> villes;

    public List<Ville> getVilles() {
        return villes;
    }

    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }

    @Override
    public String toString() {
        return "Recensement{" +
                "villes=" + villes +
                '}';
    }

    public Recensement() throws IOException {
        villes = new ArrayList<>();
        Path recensement = Paths.get("/Users/rohmane/Downloads/recensement.csv");

        List<String> lines = Files.readAllLines(recensement);
        lines.removeFirst();

        for (String line : lines) {

            String[] tokens = line.split(";");
            String codeRegion = tokens[0];
            String nomRegion = tokens[1];
            String codeDepartement = tokens[2];
            String codeCommune = tokens[5];
            String nomCommune = tokens[6];
            int popTotale = Integer.parseInt(tokens[9].replace(" ", ""));


            Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, popTotale);
            villes.add(ville);
            }


    }
}
