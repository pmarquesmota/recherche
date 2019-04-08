package pt.marquesmota.recherche;

import java.util.Random;

public abstract class Mastermind extends Game{
	static String result_guess;
	
	public static String getResult_guess() {
		return result_guess;
	}

	public static void setResult_guess(String result_guess) {
		Mastermind.result_guess = result_guess;
	}

	public Mastermind() {
		result_guess = MetaGame.length + " bien placés";
	}
	
	public static String guess(String g, String resultat) {
		String guess_digit;
		char result_letter;
		String result_guess = "";
		
		
		if (resultat == "") {
			for (int i=0; i<MetaGame.length;i++) {
				result_guess = result_guess +"0";
			}
			return result_guess;
		}
		
        Random rand = new Random();
        for (int i = 0; i<MetaGame.length; i++) {
        	result_guess = result_guess + Integer.toString(rand.nextInt(MetaGame.mastermind_width));
        }

		return result_guess;
	}

	public static String make_string(String private_string, String public_string) {
		int bien_place = 0;
		int present = 0;
		String resultat = "";
		String chiffre_secret;
		String chiffre_public;
		boolean placeholder = false;
		
		for (int i = 0; i < MetaGame.length; i++) {
			chiffre_secret = private_string.substring(i, i + 1);
			chiffre_public = public_string.substring(i, i + 1);
			
			if(chiffre_secret.equals(chiffre_public)) {
				placeholder = true;
				bien_place++;
			}
			if (private_string.indexOf(chiffre_public) != -1 && !placeholder) {
				present++;
			}
		}
		if (present != 0) {
			resultat = present + " présent, ";
		}
		resultat = resultat + bien_place + " bien placés";
		return resultat;
	}

	public static String getSecret() {
		String computer_secret = "";
		
        Random rand = new Random();
        for (int i = 0; i<MetaGame.length; i++) {
        	computer_secret = computer_secret + Integer.toString(rand.nextInt(MetaGame.mastermind_width));
        }

        return computer_secret;
	}

	public abstract void run();
}
