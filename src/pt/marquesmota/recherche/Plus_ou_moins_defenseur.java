package pt.marquesmota.recherche;

import java.util.Random;

public class Plus_ou_moins_defenseur  extends Plus_ou_moins{
	public void run() {
        String result_string = "";
        String nb = "";
        String x = "";
        String guess = "55555";
        String bottom = "00000";
        String top = "99999";
        
        x = Choose.choice("Veuillez saisir un nombre secret à 5 chiffres");
    	Result r = new Result(bottom, top, "");
        
        do {
        	r = Engine.guess(r);
        	result_string = Engine.make_string(x, guess);
            System.out.println("Résultat : " + result_string);
        } while(!result_string.equals("====="));
        System.out.println("Gagné !");

	}
}
