package fr.diginamic.banque.entites;

public class Debit extends Operation {
    public Debit(String date, int montant) {
        super(date, montant);
        getType();
    }

    public String getType() {
        return "DEBIT";
    }
    public String toString() {
        return "Le type est " + getType() + " La date est " + date + " et le montant est " + montant + "euros ";
    }
}
