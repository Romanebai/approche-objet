package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale(666,"Barbatruc",34000,"Montpellier");
        Personne personne1 = new Personne("Lovegood","Luna",adr1);
        Personne personne2 = new Personne("Severus","Rogue",adr1);

        //personne1.nom = "Lovegood";
        //personne1.prenom = "Luna";
        //personne1.AdressePostale = new AdressePostale();
        //personne1.AdressePostale.codePostal = 34000;
        //personne1.AdressePostale.numeroDeRue = 666;
        //personne1.AdressePostale.libelleDeRue = "Barbatruc";
        //personne1.AdressePostale.ville = "Montpellier";
        //personne2.nom = "Severus";
        //personne2.prenom = "Rogue";
        //personne2.AdressePostale = new AdressePostale();
        //personne2.AdressePostale.codePostal = 34090;
        //personne2.AdressePostale.numeroDeRue = 666;
        //personne2.AdressePostale.libelleDeRue = "Barbalulu";
        //personne2.AdressePostale.ville = "Montpellier";
    }
}
