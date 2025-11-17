package fr.diginamic.combat;

import java.util.Random;

public class Creature {
    private String nom;
    private int force;
    private int sante;

    public Creature(String nom) {
        Random rand = new Random();
        this.nom = nom;
        switch (this.nom) {
            case "loup":
                this.force = rand.nextInt(8 - 3 + 1) + 3;
                this.sante = rand.nextInt(10 - 5 + 1) + 5;
                break;
            case "gobelin":
                this.force = rand.nextInt(10 - 5 + 1) + 5;
                this.sante = rand.nextInt(15 - 10 + 1) + 10;
                break;
            case "troll":
                this.force = rand.nextInt(15 - 10 + 1) + 10;
                this.sante = rand.nextInt(30 - 20 + 1) + 20;
                break;
            default:
                System.out.println("Erreur");
                break;
        }
    }

    public static Creature choisirCreature() {
        Random rand = new Random();
        String[] noms = { "loup", "gobelin", "troll" };
        String creatureChoisi = noms[rand.nextInt(noms.length)];
        return new Creature(creatureChoisi);
    }

    @Override
    public String toString() {
        return  "La créature que vous combattez est un " + nom +
                ". Sa force est de " + force +
                ". Et il a " + sante + " points d'HP.";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getSante() {
        return sante;
    }

    public void setSante(int sante) {
        this.sante = sante;
    }
}
