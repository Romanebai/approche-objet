package fr.diginamic.banque.entites;

public class Credit extends Operation {

    public Credit(String date, int montant) {
        super(date, montant);
    }

    public String getType() {
        return "CREDIT";
    }

    public String toString() {
        return "Le type est " + getType() + " La date est " + date + " et le montant est " + montant + "euros ";
    }
}
