package pt.marquesmota.recherche;

import java.util.Scanner;
import java.util.Random;

public class Main {
    static String x = "";

    public static void main(String[] args) {
        String r = "";
        String nb = "";
        
        Random rand = new Random();
        for (int i = 0; i<5; i++) {
        	x = x + Integer.toString(rand.nextInt(9));
        }

        do {
            do {
                nb = getNumber();
                if(!nb.matches("\\d\\d\\d\\d\\d")) {
                	System.out.println("Veuillez saisir un nombre à 5 chiffres");
                }
            } while (!nb.matches("\\d\\d\\d\\d\\d"));
            r = Engine.make_string(x, nb);
            System.out.println("Résultat : " + r);
        } while(!r.equals("====="));
        System.out.println("Gagné !");
    }


    public  static String getNumber(){
        String n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Tapez un nombre à 5 chiffres : ");
        n = sc.nextLine();
        if(n.length() < 5){
            System.out.println("Nombre trop petit. Recommencez.");
        }
        if(n.length() > 5){
            System.out.println("Nombre trop grand. Recommencez.");
        }
        return n;
    }
}
