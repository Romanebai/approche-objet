package fr.diginamic.essais;

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
}
