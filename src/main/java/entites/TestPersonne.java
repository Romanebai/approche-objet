package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne personne1 = new Personne();
        Personne personne2 = new Personne();

        personne1.nom = "Lovegood";
        personne1.prenom = "Luna";
        personne1.AdressePostale = new AdressePostale();
        personne1.AdressePostale.codePostal = 34000;
        personne1.AdressePostale.numeroDeRue = 666;
        personne1.AdressePostale.libelleDeRue = "Barbatruc";
        personne1.AdressePostale.ville = "Montpellier";

        personne2.nom = "Severus";
        personne2.prenom = "Rogue";
        personne2.AdressePostale = new AdressePostale();
        personne2.AdressePostale.codePostal = 34090;
        personne2.AdressePostale.numeroDeRue = 666;
        personne2.AdressePostale.libelleDeRue = "Barbalulu";
        personne2.AdressePostale.ville = "Montpellier";

        System.out.println("Je suis la première personne.");
        System.out.println("Mon nom est " + personne1.nom);
        System.out.println("Mon prénom est " + personne1.prenom);
        System.out.println("Mon code postal est " + personne1.AdressePostale.codePostal);
        System.out.println("Mon numéro de rue est " + personne1.AdressePostale.numeroDeRue);
        System.out.println("Mon libéllé de rue est " + personne1.AdressePostale.libelleDeRue);
        System.out.println("Ma ville est " + personne1.AdressePostale.ville);
        System.out.println("--------------------");
        System.out.println("Je suis la deuxième personne. ");
        System.out.println("Mon nom est " + personne2.nom);
        System.out.println("Mon prénom est " + personne2.prenom);
        System.out.println("Mon code postal est " + personne2.AdressePostale.codePostal);
    }
}
