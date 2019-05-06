package recherche.jeu;

import java.util.Random;

public class Challenger extends Game {
	public void run() {
        String r = "";
        String nb = "";
        String x = "";
        String result_guess = "";
        
        for (int i=0; i<MetaGame.length;i++) {
        	result_guess = result_guess + "=";
        }

        Random rand = new Random();
        for (int i = 0; i<MetaGame.length; i++) {
        	x = x + Integer.toString(rand.nextInt(9));
        }
        if(MetaGame.dev) {
        	System.out.println("Le nombre secret est : " + x);
        }
        do {
            nb = Choose.choice("Veuillez saisir un nombre à " + MetaGame.length + " chiffres");
            r = Engine.make_string(x, nb);
            System.out.println("Résultat : " + r);
        } while(!r.equals(result_guess));
        System.out.println("Gagné !");
	}

}
