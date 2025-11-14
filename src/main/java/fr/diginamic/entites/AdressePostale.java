package fr.diginamic.entites;

public class AdressePostale {
    int numeroDeRue;
    String libelleDeRue;
    int codePostal;
    String ville;

    public AdressePostale(int numeroDeRue, String libelleDeRue, int codePostal, String ville) {
        this.numeroDeRue = numeroDeRue;
        this.libelleDeRue = libelleDeRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    //Méthode toString pour afficher
    public String toString() {
        return numeroDeRue+" "+libelleDeRue+" "+codePostal+" "+ville;
    }
}
