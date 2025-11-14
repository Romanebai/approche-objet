package fr.diginamic.operations;

//TP EN AUTONOMIE - J3
public class Operations {

    public double calcul(double a, double b, char operateur) {
       if (operateur == '+') {
           return a + b;
       } else if (operateur == '-') {
           return a - b;
       }  else if (operateur == '*') {
           return a * b;
       }  else if (operateur == '/') {
           return a / b;
       } return 0;
    }
}
