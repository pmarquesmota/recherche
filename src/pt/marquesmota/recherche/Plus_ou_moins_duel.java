package pt.marquesmota.recherche;

import java.util.Random;

public class Plus_ou_moins_duel  extends Plus_ou_moins{
	public void run() {
        String player_result_string = "";
        String player_secret = "";
        String player_guess = "";
        
        String computer_result_string = "";
        String computer_secret = "";
        String computer_guess = "";
        
        String result_guess = "";
        
        for (int i=0; i<MetaGame.length;i++) {
        	result_guess = result_guess + "=";
        }
        
        player_secret = Choose.choice("Veuillez saisir un nombre secret à " + MetaGame.length + " chiffres");
        
        Random rand = new Random();
        for (int i = 0; i<MetaGame.length; i++) {
        	computer_secret = computer_secret + Integer.toString(rand.nextInt(9));
        }

        do {
        	computer_guess = Engine.guess(computer_guess, computer_result_string);
        	System.out.println("l'ordinateur essaie : " + computer_guess);
        	computer_result_string = Engine.make_string(player_secret, computer_guess);
            System.out.println("Résultat : " + computer_result_string);
            
            player_guess = Choose.choice("Veuillez saisir un nombre à " + MetaGame.length + " chiffres");
            player_result_string = Engine.make_string(computer_secret, player_guess);
            System.out.println("Résultat : " + player_result_string);

        } while(!(computer_result_string.equals(result_guess) || player_result_string.equals(result_guess)));
        
        if(player_result_string.equals(result_guess)) {
        	System.out.println("Vous avez gagné !");
        } else {
        	System.out.println("L'ordinateur a gagné !");
        }
	}
}
