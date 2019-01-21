package pt.marquesmota.recherche;

import java.util.Scanner;

public class Main {
    static int x = 55555;

    public static void main(String[] args) {
        String r = "";
        String nb = "";

        do {
            do {
                nb = getNumber();
            } while (!nb.matches("\\d\\d\\d\\d\\d"));
            r = make_string(Integer.parseInt(nb));
            System.out.printf("Résultat : %s%n", r);
        } while(!r.equals("====="));
        System.out.println("Gagné !");
    }

    public static String make_string(int n){
        String resultat = "";
        int chiffre_secret = x;
        int chiffre_public = n;
        for(int i=0;i<5;i++){
            resultat = String.format("%s%s", resultat, compare(chiffre_secret%10, chiffre_public%10));
            chiffre_secret /= 10;
            chiffre_public /= 10;
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
