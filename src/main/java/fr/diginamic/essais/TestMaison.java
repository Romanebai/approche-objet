package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison1 = new Maison();
        Piece chambre = new Chambre(-54, -2);
        Piece chambre2 = new Chambre(70, 2);
        Piece chambre3 = new Chambre(90, 2);
        Piece salon = new Salon(80,1);
        Piece cuisine = new Cuisine(80,1);
        Piece sdb = new SalleDeBain(40,2);
        Piece wc = new WC(20,1);
        Piece wc2 = new WC(20,2);

        maison1.ajouterPiece(null);
        maison1.ajouterPiece(chambre);
        maison1.ajouterPiece(chambre2);
        System.out.println(chambre);
        System.out.println(chambre2);
        maison1.ajouterPiece(chambre3);
        maison1.ajouterPiece(salon);
        maison1.ajouterPiece(cuisine);
        maison1.ajouterPiece(sdb);
        maison1.ajouterPiece(wc);
        maison1.ajouterPiece(wc2);

        System.out.println(maison1.getSuperficiePiece(1));
        System.out.println(maison1.getSuperficiePiece(2));
        System.out.println(maison1.getSuperficieTotale());
        System.out.println(maison1);

    }
}
