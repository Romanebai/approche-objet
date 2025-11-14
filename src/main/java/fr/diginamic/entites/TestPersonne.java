package fr.diginamic.entites;

import fr.diginamic.entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale(666,"Barbatruc",34000,"Montpellier");
        AdressePostale adr2 = new AdressePostale(333, "Aluha", 30000, "Nîmes");

        Personne personne1 = new Personne("Lovegood","Lunas",adr1);
        Personne personne2 = new Personne("Severus","Rogue",adr1);

        personne1.identite();
        personne2.identite();
        personne1.modifyPrenom("Luna");
        personne1.identite();

        personne1.modifyAdressePostale(adr2);
        System.out.println(personne1);

        System.out.println(personne1.getNom() + " " + personne1.getPrenom() + " " + personne1.getAdressePostale());
    }
}
