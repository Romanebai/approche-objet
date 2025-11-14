package fr.diginamic.entites;

public class Theatre {
    private String nom;
    private int capaciteMax;
    private int totalClientInscrits;
    private double recetteTotale;

    public void inscrire(int nbClients, int prixPlace){
        //if La capaciteMax n'est pas atteinte alors ajoute nbClients du param au total de client du theatre
        //+ recalcule la recetteTotale
        //else la capaciteMax est atteinte alors message d'erreur
        if (totalClientInscrits + nbClients <= capaciteMax){
            totalClientInscrits = nbClients + totalClientInscrits;
            recetteTotale += nbClients * prixPlace;
        } else {
            System.out.println("Erreur d'inscription, la capacité max à été atteinte");
        }
    }

    public Theatre(String nom, int capaciteMax, int totalClientInscrits, double recetteTotale) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.totalClientInscrits = totalClientInscrits;
        this.recetteTotale = recetteTotale;
    }

    @Override
    public String toString() {
        return "Le nom du théatre c'est " + nom + ", sa capacité max est de " + capaciteMax +
                ", le nombre total de client inscrits est de " + totalClientInscrits +
                ", et la recette totale est de " + recetteTotale +
                " euros.";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public int getTotalClientInscrits() {
        return totalClientInscrits;
    }

    public void setTotalClientInscrits(int totalClientInscrits) {
        this.totalClientInscrits = totalClientInscrits;
    }

    public double getRecetteTotale() {
        return recetteTotale;
    }

    public void setRecetteTotale(double recetteTotale) {
        this.recetteTotale = recetteTotale;
    }
}
