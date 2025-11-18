package fr.diginamic.essais;

import fr.diginamic.equals.Pays;

public class TestEqualsPays {
    public static void main(String[] args) {
        Pays pays1 = new Pays("France", 200);
        Pays pays2 = new Pays("France", 200);
        System.out.println(pays1.equals(pays2));
        System.out.println(pays1 == pays2); //False alors que les attributs sont similaires
    }

}

