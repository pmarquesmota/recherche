package pt.marquesmota.recherche;

import java.util.Scanner;

public class Choose {
	/**
     * Given a question, a minimum number and a maximum number, it returns a number between the minimum and the maximum. 
	 * @param question The question asked.
	 * @param minimum The minimum number that can be accepted.
	 * @param maximum The maximum number that can be accepted.
	 * @return The number chosen by the user.
	 */
	public static String choice(String question) {
		Scanner s = new Scanner(System.in);

		String line = "";
		
		do {
			try {
				System.out.println(question);
				line = s.nextLine();
				if (!line.matches("\\d\\d\\d\\d\\d")) {
					System.out.println("Choix incorrect. Veuillez recommencer");
				}
			} catch(Exception e) {
				System.out.println("Choix incorrect. Veuillez recommencer et saisir un nombre");
				//Flush line before reading another
				if(s.hasNextLine()) {
					s.nextLine();
				}
				line = "";
			}
		} while (!line.matches("\\d\\d\\d\\d\\d"));
		return line;
	}
}
