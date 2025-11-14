package fr.diginamic.entites;

public class Salarie {
    String nom;
    String prenom;
    double salaire;

    public Salarie(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Le nom du salarié est : " + nom + ", son prénom est " + prenom + " et son salaire est de " + salaire + " euros.";
    }
}
