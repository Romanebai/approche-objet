package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    int remunerationTaux;

    public CompteTaux(int numeroCompte, double soldeCompte, int remunerationTaux) {
        super(numeroCompte, soldeCompte);
        this.remunerationTaux = remunerationTaux;
    }

    @Override
    public String toString() {
        String monCompteCourant = super.toString();
        return monCompteCourant + "Mon taux de rémunération : " + remunerationTaux;
    }
}
