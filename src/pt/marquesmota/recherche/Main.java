package pt.marquesmota.recherche;

import java.util.Scanner;

public class Main {
    static int x = 55555;

    public static void main(String[] args) {
        String r = "";
        int nb;

        do {
            do {
                nb = getNumber();
            } while (nb < 10000 || nb > 99999);
            r = make_string(nb);
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

    public  static int getNumber(){
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Tapez un nombre à 5 chiffres : ");
        n = sc.nextInt();
        if(n < 10000){
            System.out.println("Nombre trop petit. Recommencez.");
        }
        if(n > 99999){
            System.out.println("Nombre trop grand. Recommencez.");
        }
        return n;
    }
}
