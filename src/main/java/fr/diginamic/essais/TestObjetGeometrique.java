package fr.diginamic.essais;

import fr.diginamic.geometrie.Cercle;
import fr.diginamic.geometrie.ObjetGeometrique;
import fr.diginamic.geometrie.Rectangle;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] tab1 = new ObjetGeometrique[2];
        Cercle cercle = new Cercle(22);
        Rectangle rectangle = new Rectangle(14, 2);
        tab1[0] = cercle;
        tab1[1] = rectangle;

        for (int i = 0; i < tab1.length; i++) {
            System.out.println(tab1[i].perimetre());
            System.out.println(tab1[i].surface());
        }
    }
}
