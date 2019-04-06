package pt.marquesmota.recherche;

public class MetaGame {

	public static void run() {
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
