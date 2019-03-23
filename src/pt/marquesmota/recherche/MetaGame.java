package pt.marquesmota.recherche;

public class MetaGame {
	// Interface for the array of methods
	// see:
	// https://stackoverflow.com/questions/4280727/java-creating-an-array-of-methods
	interface GameRun {
		Game run();
	}

	// Array of methods
	private static GameRun[][] Games = new GameRun[][] { { new GameRun() {
		public Game run() {
			return new Plus_ou_moins_défenseur();
		}
	}, new GameRun() {
		public Game run() {
			return new Plus_ou_moins_défenseur();
		}
	}, new GameRun() {
		public Game run() {
			return new Plus_ou_moins_duel();
		}
	} }, { new GameRun() {
		public Game run() {
			return new Mastermind_défenseur();
		}
	}, new GameRun() {
		public Game run() {
			return new Mastermind_défenseur();
		}
	}, new GameRun() {
		public Game run() {
			return new Mastermind_duel();
		}
	} } };

	public static void run() {

	}
}
