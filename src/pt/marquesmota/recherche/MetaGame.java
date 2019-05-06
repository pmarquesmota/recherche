package pt.marquesmota.recherche;

import java.io.IOException;
import java.util.HashMap;

public class MetaGame {
	public static int length;
	public static int mastermind_width = 3;
	public static HashMap<String, String> parameters;
	public static boolean dev;
	
	public static String getResult() {
		String r = "";
		
        for (int i=0; i<MetaGame.length;i++) {
        	r = r + "=";
        }
        return r;
	}
	
	public static void run() throws IOException, FichierConfigurationException {
		parameters = Parameters.getListeParametres();
		length = Integer.parseInt(parameters.get("length"));
		dev = Boolean.parseBoolean(parameters.get("dev"));
		
		int jeu = Choose.menu("Choisissez votre jeu\n1 - plus ou moins\n2 - mastermind", 1, 2);
		int mode = Choose.menu("Choisissez votre mode\n1 - challenger\n2 - défenseur\n3 - duel", 1, 3);
		Game game = null;
		
		switch(jeu) {
		//plus ou moins
		case 1:
			switch(mode) {
			case 1:
				 game = new Plus_ou_moins_challenger();
				break;
			case 2:
				 game = new Plus_ou_moins_defenseur();
				break;
			case 3:
				 game = new Plus_ou_moins_duel();
				break;
			}
			break;
		//mastermind
		case 2:
			switch(mode) {
			case 1:
				 game = new Mastermind_challenger();
				break;
			case 2:
				 game = new Mastermind_defenseur();
				break;
			case 3:
				 game = new Mastermind_duel();
				break;
			}
			break;
		}
		game.run();
	}
}
