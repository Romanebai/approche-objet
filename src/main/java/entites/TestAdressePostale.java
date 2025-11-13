package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale(66666,"Rue The Witcher",6,"Montpellier");
        AdressePostale adr2 = new AdressePostale(66666,"Avenue de gamerland",6,"Montpellier");

        /*adr1.codePostal =  66666;
        adr1.libelleDeRue = "Rue de The Witcher";
        adr1.numeroDeRue = 6;
        adr1.ville = "Montpellier";*/

        /*adr2.codePostal =  66666;
        adr2.libelleDeRue = "Avenue de gamerland";
        adr2.numeroDeRue = 6;
        adr2.ville = "Montpellier";*/

        System.out.println(adr1.libelleDeRue);
        System.out.println(adr2.libelleDeRue);
    }
}
