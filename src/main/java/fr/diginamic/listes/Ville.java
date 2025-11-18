package fr.diginamic.listes;

import java.util.Objects;

public class Ville {
    private String nom;
    private int nbrHabitant;

    public Ville(String nom, int nbrHabitant) {
        this.nom = nom;
        this.nbrHabitant = nbrHabitant;
    }

    @Override
    public String toString() {
        return nom + " " + nbrHabitant;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ville ville)) return false;
        return nbrHabitant == ville.nbrHabitant && Objects.equals(nom, ville.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, nbrHabitant);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrHabitant() {
        return nbrHabitant;
    }

    public void setNbrHabitant(int nbrHabitant) {
        this.nbrHabitant = nbrHabitant;
    }
}
