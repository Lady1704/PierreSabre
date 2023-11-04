package histoire;

import personnages.Humain;

public class HistoireTP4 {
    public static void main(String[] args) {
        Humain prof = new Humain("Prof", "kombucha", 54);
        prof.direBonjour(12);
        prof.boire();
        prof.perdreArgent(12);
        prof.acheter("jeu", 2);
        prof.acheter("kimono", 50);
    }
}
