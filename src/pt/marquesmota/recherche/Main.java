package pt.marquesmota.recherche;

import java.util.Random;

public class Main {
    static String x = "";

    public static void main(String[] args) {
        String r = "";
        String nb = "";
        
        Random rand = new Random();
        for (int i = 0; i<4; i++) {
        	x = x + Integer.toString(rand.nextInt(9));
        }

        do {
            nb = Choose.choice("Veuillez saisir un nombre à 4 chiffres");
            r = Engine.make_string(x, nb);
            System.out.println("Résultat : " + r);
        } while(!r.equals("====="));
        System.out.println("Gagné !");
    }

}
