package pt.marquesmota.recherche;

public class Engine {
	public static Result guess(Result r) {
        String resultat = "";
		String guess_digit;
		String hint_letter;
		
		if(r.getGuess == "") {
			return "55555";
		}
		for(int i=0;i<5;i++){
			guess_digit = oldguess.substring(i, i + 1);
			hint_letter = hint.substring(i, i + 1);
            resultat = resultat + guess_digit(Integer.parseInt(guess_digit), hint_letter);
        }
	}
	
    public static String make_string(String private_string, String public_string){
        String resultat = "";
        String chiffre_secret;
        String chiffre_public;
        
        for(int i=0;i<5;i++){
            chiffre_secret = private_string.substring(i, i + 1);
            chiffre_public = public_string.substring(i, i + 1);
            resultat = resultat + compare(Integer.parseInt(chiffre_secret), Integer.parseInt(chiffre_public));
        }
        return resultat;
    }

    public static char  compare(int a, int b){
            if(a>b){
                return '+';
            }
            if(a<b) {
                return '-';
            }
            if(a==b) {
                return '=';
            }
            return '?';
    }

}
