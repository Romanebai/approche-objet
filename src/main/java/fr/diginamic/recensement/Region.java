package fr.diginamic.recensement;

import fr.diginamic.fichier.Ville;

import java.util.Objects;

public class Region implements Comparable<Region> {
    private String codeRegion;
    private String nomRegion;
    private int populationRegion;

    public Region(String codeRegion, String nomRegion, int populationRegion) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.populationRegion = populationRegion;
    }

    public int compareTo(Region autreRegion) {
        return Integer.compare(autreRegion.getPopulationRegion(), this.populationRegion);
    }


    @Override
    public String toString() {
        return "Region{" +
                "codeRegion='" + codeRegion + '\'' +
                ", nomRegion='" + nomRegion + '\'' +
                ", populationRegion=" + populationRegion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Region region)) {
            return false;
        }
        return populationRegion == region.getPopulationRegion() && Objects.equals(codeRegion, region.getCodeRegion()) && Objects.equals(nomRegion, region.getNomRegion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeRegion, nomRegion, populationRegion);
    }

    public void ajouterPopulationRegion(int populationRegion) {
        this.populationRegion = populationRegion;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public int getPopulationRegion() {
        return populationRegion;
    }

    public void setPopulationRegion(int populationRegion) {
        this.populationRegion = populationRegion;
    }
}
