package fr.diginamic.maps;

import java.util.Objects;

public class Pays {
    private String nom;
    private double nbrHabitants;
    private String continent;

    public Pays(String nom, double nbrHabitants, String continent) {
        this.nom = nom;
        this.nbrHabitants = nbrHabitants;
        this.continent = continent;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pays pays)) {
            return false;
        }
        return nbrHabitants == pays.nbrHabitants && Objects.equals(nom, pays.nom) && Objects.equals(continent, pays.continent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, nbrHabitants, continent);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getNbrHabitants() {
        return nbrHabitants;
    }

    public void setNbrHabitants(double nbrHabitants) {
        this.nbrHabitants = nbrHabitants;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
