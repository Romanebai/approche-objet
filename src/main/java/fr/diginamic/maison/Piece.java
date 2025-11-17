package fr.diginamic.maison;

public abstract class Piece {
    double superficie;
    int etage;


    public Piece(double superficie, int etage) {
        this.superficie = superficie;
        this.etage = etage;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "superficie=" + superficie +
                ", etage=" + etage +
                '}';
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }
}