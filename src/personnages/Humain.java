package personnages;

public class Humain {
    private String nom;
    private String boissonFavorite;
    private int argent;

    public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
    }

    public String getNom() {
        return nom;
    }

    public int getArgent() {
        return argent;
    }

    public void parler(String texte) {
        System.out.println(texte);
    }

    public void direBonjour(int prix) {
        parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
        parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir une boisson à " + prix + " sous.");

    }

    public void boire() {
        parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }

    
    public void acheter(String bien, int prix) {
        if (argent >= prix) {
            parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un " + bien + " à " + prix + " sous ");
            argent -= prix;
        } else {
            parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à " + prix + " sous " );
        }
    }

    public void gagnerArgent(int gain) {
        argent += gain;
        parler("J'ai gagné " + gain + " sous. J'ai maintenant " + argent + " sous en poche.");
    }

    public void perdreArgent(int perte) {
        if (argent >= perte) {
            argent -= perte;
            parler("J'ai perdu " + perte + " sous. Il me reste " + argent + " sous en poche.");
        } else {
            parler("Je n'ai pas assez d'argent pour perdre " + perte + " sous.");
        }
    }
}
