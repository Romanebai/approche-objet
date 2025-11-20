package fr.diginamic.recensement;

import fr.diginamic.recensement.services.*;

import java.io.IOException;
import java.util.Scanner;

public class ApplicationRecensement {
    public static void main(String[] args) throws IOException {

        Recensement recensement = new Recensement();

        Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        while (!stop) {
            System.out.println("-------MENU-------");
            System.out.println("1.Population d'une ville donnée.");
            System.out.println("2.Population d'un département donné.");
            System.out.println("3.Population d'une région donné.");
            System.out.println("4.Afficher les 10 régions les plus peuplées.");
            System.out.println("5.Afficher les 10 départements les plus peuplés.");
            System.out.println("6.Afficher les 10 villes les plus peuplées d'un département.");
            System.out.println("7.Afficher les 10 villes les plus peuplées d'une région.");
            System.out.println("8.Afficher les 10 villes les plus peuplées de France.");
            System.out.println("9.Quitter.");
            int choix = Integer.parseInt(scanner.nextLine());

            switch (choix) {
                case 1:
                    RecherchePopulationVille recherche = new RecherchePopulationVille();
                    recherche.traiter(recensement, scanner);
                    break;
                case 2:
                    RecherchePopulationDepartement recherche2 = new RecherchePopulationDepartement();
                    recherche2.traiter(recensement, scanner);
                    break;
                case 3:
                    RecherchePopulationRegion recherche3 = new RecherchePopulationRegion();
                    recherche3.traiter(recensement, scanner);
                    break;
                case 4:
                    Top10Regions recherche4 = new Top10Regions();
                    recherche4.traiter(recensement, scanner);
                    break;
                case 5:
                    Top10Departements recherche5 = new Top10Departements();
                    recherche5.traiter(recensement, scanner);
                    break;
                case 6:
                    Top10VillesDepartement recherche6 = new Top10VillesDepartement();
                    recherche6.traiter(recensement, scanner);
                    break;
                case 7:
                    Top10VillesRegion recherche7 = new Top10VillesRegion();
                    recherche7.traiter(recensement, scanner);
                    break;
                case 8:
                    Top10VillesFrance recherche8 = new Top10VillesFrance();
                    recherche8.traiter(recensement, scanner);
                    break;
                case 9:
                    stop = true;
                    break;
            }
        }
    }
}
