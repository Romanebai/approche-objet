package fr.diginamic.combat;

import java.util.Random;

public class Personnage {
    private int force;
    private int sante;
    private int score = 0;
    private Potion[] potions;

    public Personnage() {
        Random rand = new Random();
        this.force = rand.nextInt(18 - 12 + 1) + 12;
        this.sante = rand.nextInt(50 - 20 + 1) + 20;
        this.score = 0;
        this.potions = new Potion[3];
        this.potions[0] = new Potion("soin", rand.nextInt(10 - 5 + 1) + 5, 0);
        this.potions[1] = new Potion("attaque mineure", 3, 1);
        this.potions[2] = new Potion("attaque majeure", 5, 2);

    }

    @Override
    public String toString() {
        return "Votre personnage a "+ force + " de force." +
                " Il a " + sante + " de santé. Et votre score est de : " + score;
    }

    public void utiliserPotion(int index) {
        if (potions[index] != null) {
            switch (potions[index].getType()) {
                case "soin":
                    sante += potions[index].getEffet();
                    System.out.println("Vous vous êtes heal de " + potions[index].getEffet() + "points.");
                    break;
                case "attaque mineure":
                    force += potions[index].getEffet();
                    System.out.println("Votre attaque sera de " +  potions[index].getEffet() + " supplémentaire lors du prochain tour.");
                    break;
                case "attaque majeure":
                     force += potions[index].getEffet();
                    System.out.println("Votre attaque sera de " +  potions[index].getEffet() + " supplémentaire lors des deux prochain tours.");
                     break;
                default:
                     System.out.println("Erreur sur la potion");
            }
            potions[index] = null;
        } else  {
            System.out.println("Pas de potion");
        }
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Potion[] getPotions() {
        return potions;
    }

    public void setPotions(Potion[] potions) {
        this.potions = potions;
    }
}
