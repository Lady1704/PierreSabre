package personnages;

public class Yakuza extends Humain {
    private String clan;
    private int reputation;
    private int argent;

    public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
        super(nom, boissonFavorite, argent);
        this.clan = clan;
        this.reputation = 0;
        this.argent = argent;
        parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
    }

    public void extorquer(Commercant victime) {
        int argentVole = victime.getArgent();
        argent += argentVole;
        reputation ++;
        parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        parler("Marco, si tu tiens à la vie, donne-moi ta bourse !");
        victime.seFaireExtorquer();
        parler("J'ai piqué les " + argentVole + " sous de Marco, ce qui me fait " + argent + " sous dans ma poche. Hi! Hi!");
    }
}
