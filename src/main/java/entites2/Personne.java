package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale AdressePostale;

    public Personne (String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne (String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        AdressePostale = adressePostale;
    }

    public void identite () {
        System.out.println(nom.toUpperCase() + " " + prenom);
    }

    public void modifyPrenom (String prenom) {
        this.prenom = prenom;
    }

    public void modifyAdressePostale (AdressePostale adressePostale) {
        this.AdressePostale = adressePostale;
    }

    @Override
    public String toString() {
        return nom + " " + prenom + " " + AdressePostale;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public AdressePostale getAdressePostale() {
        return AdressePostale;
    }
}
