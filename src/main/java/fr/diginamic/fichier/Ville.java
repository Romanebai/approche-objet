package fr.diginamic.fichier;

import java.text.Collator;
import java.util.Locale;
import java.util.Objects;

public class Ville implements Comparable<Ville> {
    private String nom;
    private String departement;
    private String nomRegion;
    private int popTotale;

    public Ville(String nom, String departement, String nomRegion, int popTotale) {
        this.nom = nom;
        this.departement = departement;
        this.nomRegion = nomRegion;
        this.popTotale = popTotale;
    }

    /*@Override
    public int compareTo(Ville autre) {
        Collator collator = Collator.getInstance(Locale.FRANCE);
        return collator.compare(this.getNom(), autre.getNom());
    }*/

    @Override
    public int compareTo(Ville autre) {
        int result = Integer.compare(this.popTotale, autre.popTotale);
        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ville ville)) {
            return false;
        }
        return popTotale == ville.popTotale && Objects.equals(nom, ville.nom) && Objects.equals(departement, ville.departement) && Objects.equals(nomRegion, ville.nomRegion);
    }

    @Override
    public String toString() {
        return "La ville est : " + nom + '\'' +
                " Son département : " + departement + '\'' +
                " La région c'est : " + nomRegion + '\'' +
                " Et sa pop totale : " + popTotale ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, departement, nomRegion, popTotale);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public int getPopTotale() {
        return popTotale;
    }

    public void setPopTotale(int popTotale) {
        this.popTotale = popTotale;
    }
}
