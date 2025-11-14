package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte monCompte = new Compte(234, 3.4);
        System.out.println(monCompte);

        Compte[] tableau = new Compte[2];
        tableau[0] = new Compte(66, 21);
        tableau[1] = new CompteTaux(66, 21, 70);

        for (int i = 0; i < tableau.length; i++) {
        System.out.println(tableau[0]);
        System.out.println(tableau[1]);
        }

    }
}
