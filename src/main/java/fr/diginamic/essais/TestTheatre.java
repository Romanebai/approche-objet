package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {

        Theatre theatre1 = new Theatre("Théatre de Roro", 50, 0, 0 );
        theatre1.inscrire(14,15);
        theatre1.inscrire(24,15);
        theatre1.inscrire(5,15);
        //theatre1.inscrire(25,15); //erreur, capacité max atteinte

        System.out.println(theatre1);
        System.out.println(theatre1.getTotalClientInscrits());
        System.out.println(theatre1.getRecetteTotale());
    }
}
