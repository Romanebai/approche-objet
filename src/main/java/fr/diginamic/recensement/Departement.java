package fr.diginamic.recensement;

import java.util.Objects;

public class Departement implements Comparable<Departement> {
    private String codeDepartement;
    private int populationDepartement;

    public Departement(String codeDepartement, int populationDepartement) {
        this.codeDepartement = codeDepartement;
        this.populationDepartement = populationDepartement;
    }


    public int compareTo(Departement autreDepartement) {
        return Integer.compare(autreDepartement.getPopulationDepartement(), this.populationDepartement);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "codeDepartement='" + codeDepartement + '\'' +
                ", populationDepartement=" + populationDepartement +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Departement departement)) {
            return false;
        }
        return populationDepartement == departement.getPopulationDepartement() && Objects.equals(codeDepartement, departement.getCodeDepartement());
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeDepartement, populationDepartement);
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public int getPopulationDepartement() {
        return populationDepartement;
    }

    public void setPopulationDepartement(int populationDepartement) {
        this.populationDepartement = populationDepartement;
    }


}
