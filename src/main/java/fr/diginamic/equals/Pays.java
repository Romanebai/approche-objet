package fr.diginamic.equals;

import java.util.Objects;

public class Pays {
    private String nom;
    private int population;

    public Pays(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pays pays)) {
            return false;
        }
        return population == pays.getPopulation() && Objects.equals(nom, pays.getNom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, population);
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", population=" + population +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
