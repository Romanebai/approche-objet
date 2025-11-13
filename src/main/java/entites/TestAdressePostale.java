package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale();
        AdressePostale adr2 = new AdressePostale();

        adr1.codePostal =  66666;
        adr1.libelleDeRue = "Rue de The Witcher";
        adr1.numeroDeRue = 6;
        adr1.ville = "Montpellier";

        adr2.codePostal =  66666;
        adr2.libelleDeRue = "Avenue de gamerland";
        adr2.numeroDeRue = 6;
        adr2.ville = "Montpellier";

        System.out.println("Mon libellé de rue est " + adr1.libelleDeRue);
        System.out.println("Mon libelle de rue est " + adr2.libelleDeRue);
    }
}
