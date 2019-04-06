package pt.marquesmota.recherche;

import java.util.Random;

public class Plus_ou_moins_challenger extends Plus_ou_moins{
	public void run() {
        String r = "";
        String nb = "";
        String x = "";
        
        Random rand = new Random();
        for (int i = 0; i<4; i++) {
        	x = x + Integer.toString(rand.nextInt(9));
        }

        do {
            nb = Choose.choice("Veuillez saisir un nombre à 5 chiffres");
            r = Engine.make_string(x, nb);
            System.out.println("Résultat : " + r);
        } while(!r.equals("====="));
        System.out.println("Gagné !");
	}

}
