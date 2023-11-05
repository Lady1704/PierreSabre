package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {
    public static void main(String[] args) {
        Humain prof = new Humain("Prof", "kombucha", 54);
        prof.direBonjour(12);
        prof.boire();
        prof.perdreArgent(12);
        prof.acheter("jeu", 2);
        prof.acheter("kimono", 50);
        Commercant marco = new Commercant("Marco", "thé", 20);
        Yakuza yakuza = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
        yakuza.extorquer(marco);
        marco.recevoir(15);
        marco.boire();
    }
}
