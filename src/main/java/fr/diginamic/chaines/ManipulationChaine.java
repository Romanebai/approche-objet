package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
    static String chaine = "Durand;Marcel;2 523.5";

    public static void main(String[] args) {
        char premierCaractere = chaine.charAt(0);
        System.out.println(premierCaractere);

        int longueur = chaine.length();
        System.out.println(longueur);

        int indexPremierCaractere = chaine.indexOf(';');
        System.out.println(indexPremierCaractere);

        String portionChaine = chaine.substring(0, indexPremierCaractere);
        System.out.println(portionChaine);

        String nomMaj =  chaine.substring(0, indexPremierCaractere).toUpperCase();
        System.out.println(nomMaj);

        String nomMin =  chaine.substring(0, indexPremierCaractere).toLowerCase();
        System.out.println(nomMin);

        String[] decoupe = chaine.split(";");
        for (int i = 0; i < decoupe.length; i++) {
            System.out.println("J'ai ça dans mon tableau : " + decoupe[i]);
        }

        String salaireSansEspace = decoupe[2].replace(" ", "");
        double salaire =  Double.parseDouble(salaireSansEspace);
        Salarie employe = new Salarie(decoupe[0], decoupe[1], salaire);
        System.out.println(employe);

    }
}
