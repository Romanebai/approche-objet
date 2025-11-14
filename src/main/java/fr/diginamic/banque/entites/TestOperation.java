package fr.diginamic.banque.entites;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] ope = new Operation[4];
        ope[0] = new Credit("Vendredi 14 novembre", 43);
        ope[1] = new Debit("Lundi 12 février", 239);
        ope[2] = new Credit("Jeudi 24 aout", 2343);
        ope[3] = new Debit("Lundi 2 décembre", 1100);

        double total = 0;

        for (int i = 0; i < ope.length; i++) {
            if (ope[i] instanceof Credit) {
               total += ope[i].getMontant();
            }  else if (ope[i] instanceof Debit) {
                total -= ope[i].getMontant();
            }
            System.out.println(ope[i] + " Montant total de l'opération : " + total);
        }
    }

}
