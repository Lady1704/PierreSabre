package personnages;

public class Ronin extends Humain{
	private int honneur;
	private int argent;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
        this.honneur = 1;
        this.argent = argent;
        parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDonne = (int)(getArgent() * 0.10); // Calcul de 10% de l'argent du Ronin
	    parler(beneficiaire.getNom() + " prend ces " + argentDonne + " sous.");
	    beneficiaire.recevoir(argentDonne);
	}
}
