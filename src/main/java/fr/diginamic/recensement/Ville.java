package fr.diginamic.recensement;

import java.util.Objects;

public class Ville implements Comparable<Ville> {
    private String codeRegion;
    private String nomRegion;
    private String codeDepartement;
    private String codeCommune;
    private String nomCommune;
    private int popTotale;


    public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune, int popTotale) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDepartement = codeDepartement;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.popTotale = popTotale;
    }

    @Override
    public String toString() {
        return
                "Code de la region : " + codeRegion + '\'' +
                ", Nom de la region : " + nomRegion + '\'' +
                ", Code du departement : '" + codeDepartement + '\'' +
                ", code de la commune : '" + codeCommune + '\'' +
                ", nom de la commune : '" + nomCommune + '\'' +
                ", Population totale : " + popTotale;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ville ville)) {
            return false;
        }
        return popTotale == ville.popTotale && Objects.equals(codeRegion, ville.codeRegion) && Objects.equals(nomRegion, ville.nomRegion) && Objects.equals(codeDepartement, ville.codeDepartement) && Objects.equals(codeCommune, ville.codeCommune) && Objects.equals(nomCommune, ville.nomCommune);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, popTotale);
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

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getCodeCommune() {
        return codeCommune;
    }

    public void setCodeCommune(String codeCommune) {
        this.codeCommune = codeCommune;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    public int getPopTotale() {
        return popTotale;
    }

    public void setPopTotale(int popTotale) {
        this.popTotale = popTotale;
    }

    public int compareTo(Ville autre) {
        return Integer.compare(autre.getPopTotale(), this.getPopTotale());

    }
}



