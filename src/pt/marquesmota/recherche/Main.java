package pt.marquesmota.recherche;

import java.util.Scanner;

public class Main {
    static String x = "55555";

    public static void main(String[] args) {
        String r = "";
        String nb = "";

        do {
            do {
                nb = getNumber();
            } while (!nb.matches("\\d\\d\\d\\d\\d"));
            r = make_string(nb);
            System.out.println("Résultat : " + r);
        } while(!r.equals("====="));
        System.out.println("Gagné !");
    }

    public static String make_string(String n){
        String resultat = "";
        String chiffre_secret;
        String chiffre_public;
        
        for(int i=0;i<5;i++){
            chiffre_secret = x.substring(i, i + 1);
            chiffre_public = n.substring(i, i + 1);
            resultat = resultat + compare(Integer.parseInt(chiffre_secret), Integer.parseInt(chiffre_public));
        }
        return new StringBuilder(resultat).reverse().toString();
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
