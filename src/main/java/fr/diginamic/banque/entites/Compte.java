package fr.diginamic.banque.entites;

public class Compte {
   private int numeroCompte;
   private double soldeCompte;

    public Compte(int numeroCompte, double soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString() {
        return "Mon numéro de compte est le : " + numeroCompte + " et mon solde est de : " + soldeCompte + " euros";
    }
}


