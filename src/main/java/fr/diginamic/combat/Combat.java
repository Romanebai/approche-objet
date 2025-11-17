package fr.diginamic.combat;

import java.util.Random;

public class Combat {
    private Personnage perso;
    private Creature creature;

    public Combat(Personnage perso, Creature creature) {
        this.perso = perso;
        this.creature = creature;
    }

    public void demarrer() {
        int tour = 1;
        while (perso.getSante() > 0 && creature.getSante() > 0) {
            System.out.println("\n--- Tour " + tour + " ---");
            Random random = new Random();
            int atqTour = perso.getForce() + random.nextInt(10 - 1 + 1) + 1;
            System.out.println("Votre attaque pour ce tour est de " + atqTour + ".");

            int atqCreatureTour = creature.getForce() + random.nextInt(10 - 1 + 1) + 1;
            System.out.println("L'attaque de la créature pour ce tour est de " + atqCreatureTour + ".");

            if (atqTour > atqCreatureTour) {
                int degats = atqTour - atqCreatureTour;
                creature.setSante(creature.getSante() - degats);
                System.out.println("Vous infligez " + degats + " pts de dégats à la créature." +
                        " Il lui reste " + creature.getSante() + " pts de santé.");
            } else if (atqCreatureTour > atqTour) {
                int degats = atqCreatureTour - atqTour;
                perso.setSante(perso.getSante() - degats);
                System.out.println("La créature vous inflige " + degats + " pts de dégats." +
                        " Il vous reste " + perso.getSante() + " pts de santé.");
            } else {
                System.out.println("Egalité pour ce tour.");
            }
            System.out.println("--- Combat terminé ---");
            System.out.println("Votre santé : " + perso.getSante());
            System.out.println("Santé de la créature : " + creature.getSante());

            tour++;
        }

        if (perso.getSante() <= 0) {
            System.out.println("Votre personnage est décédé, votre score est de " + perso.getScore() +" points. Veuillez créer un nouveau personnage");
            perso = null;
        } else if (creature.getSante() <= 0) {

        switch (creature.getNom()){
            case "loup":
                perso.setScore(perso.getScore() + 1);
                break;
            case "gobelin":
                perso.setScore(perso.getScore() + 2);
                break;
            case "troll":
                perso.setScore(perso.getScore() + 5);
                break;
            default:
                System.out.println("Erreur dans le score.");
                break;
            }  System.out.println("Bravo ! La créature est morte. Votre score actuel est de "+ perso.getScore() +" points.");
        }
    }
}


