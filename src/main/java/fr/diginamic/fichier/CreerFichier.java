package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path recens = Paths.get("/Users/rohmane/Downloads/recensement.csv");
        List<String> lines = Files.readAllLines(recens);

        //Avec la méthode subList
        List<String> lines2 = lines.subList(1, 100);
        System.out.println(lines2);

        //Avec une boucle for classique
        /*int compteur = 0;
        for (int i = 0; i < 100; i++) {
            compteur++;
            System.out.println(lines.get(i) + "MOn compteur est à : " + compteur);
        }*/

        Path recens2 = Paths.get("/Users/rohmane/Downloads/recensement2.csv");
        Files.write(recens2, lines2);
    }
}

