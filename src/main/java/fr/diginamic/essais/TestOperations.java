package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        Operations op1 = new Operations();
        Operations op2 = new Operations();
        Operations op3 = new Operations();
        Operations op4 = new Operations();

        double result = op1.calcul(10, 3, '+');
        double result2 = op2.calcul(10, 3, '-');
        double result3 = op3.calcul(10, 3, '*');
        double result4 = op4.calcul(10, 3, '/');

        System.out.println("Le resultat est : " + result);
        System.out.println("Le resultat est : " + result2);
        System.out.println("Le resultat est : " + result3);
        System.out.println("Le resultat est : " + result4);
    }
}
