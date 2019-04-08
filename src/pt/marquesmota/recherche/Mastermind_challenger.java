package pt.marquesmota.recherche;

import java.util.Random;

public class Mastermind_challenger extends Mastermind{
	public void run() {
		String x = "";
		String nb = "";
		String r = "";
		
		
        Random rand = new Random();
        for (int i = 0; i<MetaGame.length; i++) {
        	x = x + Integer.toString(rand.nextInt(MetaGame.mastermind_width - 1));
        }
        
        do {
            nb = Choose.choice("Veuillez saisir un nombre à " + MetaGame.length + " chiffres");
            r = super.make_string(x, nb);
            System.out.println("Réponse : " + r);
        } while(!r.equals(super.getResult_guess()));
        System.out.println("Gagné !");

	}
}
