package fr.diginamic.operations;

public class CalculMoyenne {
    double[] tableau = new double[3];
    int index = 0;

    public void ajout(double nombre) {

        if (index >= tableau.length) {
            double[] tableau2 = new double[tableau.length + 1];
            for (int i = 0; i < index; i++) {
                tableau2[i] = tableau[i];
            }
            tableau = tableau2;
        }
        tableau[index] = nombre;
        index++;
    }

    public double calcul() {
        double moyenne = 0;
        for (int i = 0; i < tableau.length; i++) {
            moyenne += tableau[i];
        } return moyenne / index;
    }
}
