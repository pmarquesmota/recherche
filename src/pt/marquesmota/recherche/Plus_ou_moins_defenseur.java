package pt.marquesmota.recherche;

public class Plus_ou_moins_defenseur  extends Plus_ou_moins{
	public void run() {
        String result_string = "";
        String x = "";
        String guess = "";
        String result_guess = "";
        
        for (int i=0; i<MetaGame.length;i++) {
        	result_guess = result_guess + "=";
        }
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
