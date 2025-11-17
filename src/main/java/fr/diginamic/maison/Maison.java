package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

    Piece[] pieces = new Piece[2];
    int index = 0;

    @Override
    public String toString() {
        return "Maison{" +
                "pieces=" + Arrays.toString(pieces) +
                ", index=" + index +
                '}';
    }

    public void ajouterPiece(Piece piece){
        //Permet d'ajouter une pièce à la maison
        if (piece == null){
            System.out.println("Impossible d'ajouter une pièce Null");
            return;
        }
        if (piece.getSuperficie() <= 0 || piece.getEtage() < 0) {
            System.out.println("Impossible d'ajouter une pièce avec superficie ou étage non cohérent");
            return;
        }
        if (index >= pieces.length) {
            Piece[] pieces2 = new Piece[pieces.length +1];
            for (int i = 0; i < index; i++) {
                pieces2[i] = pieces[i];
            }
            pieces = pieces2;
        }
        pieces[index] = piece;
        index++;
    }


    public double getSuperficieTotale(){
        //retourne la superficie totale de la maison
        double total = 0;

        for (int i = 0; i< index; i++) {
            total += pieces[i].getSuperficie();
        }
        return total;
    }

    public double getSuperficiePiece(int etage){
        //retourne la superficie d'un etage donné
        double totalPiece = 0;
        for (int i = 0; i< index; i++) {
            if (pieces[i].getEtage() == etage) {
                totalPiece += pieces[i].getSuperficie();
            }
        }

        return totalPiece;
    }


}
