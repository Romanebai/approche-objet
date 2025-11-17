package fr.diginamic.combat;

import java.util.Scanner;

public class TestCombat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personnage perso = null;
        boolean stop = false;

        while (!stop) {
            System.out.println("-----MENU-----");
            System.out.println("1. Créer un personnage.");
            System.out.println("2. Combattre une créature.");
            System.out.println("3. Afficher votre inventaire.");
            System.out.println("4. Prendre une potion.");
            System.out.println("5. Afficher votre score.");
            System.out.println("6. Quitter.");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    if (perso == null) {
                        perso = new Personnage();
                        System.out.println(perso);
                    } else {
                        System.out.println("Un personnage existe déjà, attendez qu'il meure.");
                    }
                    break;
                case 2:
                    if (perso == null) {
                        System.out.println("Veuillez créer un personnage.");
                    } else if (perso.getSante() <= 0) {
                        System.out.println("Votre personnage est décédé, il a obtenu un score de " + perso.getScore() +" points. Veuillez créer un nouveau personnage");
                    } else {
                        Creature creature = Creature.choisirCreature();
                        System.out.println(creature);
                        Combat combat = new Combat(perso,creature);
                        combat.demarrer();
                        if (perso.getSante() <= 0) {
                            perso = null;
                        }
                    } break;
                case 3:
                    if (perso == null) {
                        System.out.println("Veuillez créer un personnage.");
                    } else {
                        System.out.println("-----INVENTAIRE-----");
                        for (int i = 0; i < perso.getPotions().length; i++) {
                            Potion potion = perso.getPotions()[i];
                            if (potion != null) {
                                System.out.println("Vous possèdez une potion de type : " + potion.getType());
                            } else {
                                System.out.println("Vous n'avez pas de potions.");
                            }
                        }
                    } break;
                case 4:
                    break;
                case 5:
                    if (perso != null) {
                        System.out.println("Votre score est de " + perso.getScore() + ".");
                    } else System.out.println("Le personnage n'existe pas.");
                    break;
                case 6:
                    stop = true;
                    break;
                default:
                    System.out.println("Erreur");
            }
        }
    }
}
