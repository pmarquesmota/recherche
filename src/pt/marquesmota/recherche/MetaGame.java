package pt.marquesmota.recherche;

public class MetaGame {
	// Interface for the array of methods
	// see:
	// https://stackoverflow.com/questions/4280727/java-creating-an-array-of-methods
	interface GameRun {
		Game create();
	}

	// Array of methods
	private static GameRun[][] Games = new GameRun[][] { { new GameRun() {
		public Game create() {
			return new Plus_ou_moins_challenger();
		}
	}, new GameRun() {
		public Game create() {
			return new Plus_ou_moins_defenseur();
		}
	}, new GameRun() {
		public Game create() {
			return new Plus_ou_moins_duel();
		}
	} }, { new GameRun() {
		public Game create() {
			return new Mastermind_challenger();
		}
	}, new GameRun() {
		public Game create() {
			return new Mastermind_defenseur();
		}
	}, new GameRun() {
		public Game create() {
			return new Mastermind_duel();
		}
	} } };

	public static void run() {
		int jeu = Choose.menu("Choisissez votre jeu\n1 - plus ou moins\n2 - mastermind", 1, 2);
		int mode = Choose.menu("Choisissez votre mode\n1 - challenger\n2 - défenseur\n3 - duel", 1, 3);
		
		Game game = Games[jeu-1][mode-1].create();
		game.run();
	}
}
