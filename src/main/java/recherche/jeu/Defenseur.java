package recherche.jeu;

public class Defenseur  extends Game {
	public void run() {
        String result_string = "";
        String x = "";
        String guess = "";
        String result_guess = MetaGame.getResult();
        
        x = Choose.choice("Veuillez saisir un nombre secret à " + MetaGame.length + " chiffres");
        
        do {
            guess = Engine.guess(guess, result_string);
        	System.out.println("l'ordinateur essaie : " + guess);
        	
        	result_string = Engine.make_string(x, guess);
            System.out.println("Résultat : " + result_string);
        } while(!result_string.equals(result_guess));
        System.out.println("Gagné !");

	}
}
