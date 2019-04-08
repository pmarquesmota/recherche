package pt.marquesmota.recherche;

public class Mastermind_defenseur  extends Mastermind{
	public void run() {
        String result_string = "";
        String x = "";
        String guess = "";
        
        x = Choose.choice("Veuillez saisir un nombre secret à " + MetaGame.length + " chiffres");
        
        do {
            guess = super.guess(guess, result_string);
        	System.out.println("l'ordinateur essaie : " + guess);
        	
        	result_string = super.make_string(x, guess);
            System.out.println("Résultat : " + result_string);
        } while(!result_string.equals(super.getResult_guess()));
        System.out.println("Gagné !");

	}

}
