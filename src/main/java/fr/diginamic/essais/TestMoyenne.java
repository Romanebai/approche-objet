package fr.diginamic.essais;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;
import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne cm = new CalculMoyenne();
        cm.ajout(2);
        cm.ajout(10);
        cm.ajout(5);
        cm.ajout(3);

        System.out.println(cm.calcul());

        CalculMoyenne cm2 = new CalculMoyenne();
        cm2.ajout(12.54);
        cm2.ajout(1245.543);
        cm2.ajout(123.1);
        cm2.ajout(12456.123);
        System.out.println(cm2.calcul());


    }

    public static class TestBanque {
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
}
