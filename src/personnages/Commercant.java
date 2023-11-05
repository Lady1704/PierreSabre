package personnages;

public class Commercant extends Humain{
	
	public Commercant(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		 parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
	}
	
	public void seFaireExtorquer() {
		 int argentPerdu = getArgent();
//	     perdreArgent(argentPerdu);
	     parler("J’ai tout perdu! Le monde est trop injuste...");
	}
	public void recevoir(int argent) {
		parler(argent + " sous! Je te remercie généreux donateur!");
	}
}
