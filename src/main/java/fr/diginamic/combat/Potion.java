package fr.diginamic.combat;

public class Potion {
    private String type;
    private int effet;
    private int duree;

    public Potion(String type, int effet, int duree) {
        this.type = type;
        this.effet = effet;
        this.duree = duree;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEffet() {
        return effet;
    }

    public void setEffet(int effet) {
        this.effet = effet;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }
}
