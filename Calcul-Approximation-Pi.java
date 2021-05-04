package frac;

import java.util.Scanner;
public class Travail {
    public static void main(String[] args) {

        int valeur = 0;

        do {
            System.out.println("== Calcul d'une approximation de pi");
            System.out.println("  1. Entrez 1 pour calculer une approximation de pi");
            System.out.println("  2. Entrez 2 pour quitter le logiciel ");
            System.out.print("Quel est votre choix ?");
            Scanner clavier = new Scanner(System.in);
            int choix = clavier.nextInt();


            if (choix != 1 && choix != 2) System.out.println("Erreur! Entrez une valeur conforme");

            if (choix == 2) System.out.println("Vous quittez le menu!");

            if (choix == 1)
                Calcul(valeur);


        } while (valeur == 0);
    }

    public static double Calcul(double valeur) {

        int iterations = -1;

        do {
            System.out.print("Entrez une valeur entre 1 et 1000000 : ");
            Scanner lecteur = new Scanner(System.in);
            boolean entier_2 = lecteur.hasNextInt();
            if (entier_2 == true) {
                iterations = lecteur.nextInt();

            }

            // On vide le tampon.
            lecteur.nextLine();
        } while (iterations < 1 || iterations > 1000000);
        double
        var = 0;
        double pi = 0;
        for (double n = 1; n <= iterations; n++) {
            var =
            var +(1 / (n * n));
            pi = Math.sqrt((var * 6));
        }
        AffichagePi(pi);
        PourcentagePi(pi);
        return pi;

    }
    public static void AffichagePi(double pi) {
        System.out.println(pi);

    }


    public static void PourcentagePi(double pi) {
        double approx = pi;
        double vrai_pi = Math.PI;
        double percentage = (approx * 100 / vrai_pi);
        System.out.println(percentage + "% de la vraie valeur de Pi ");

    }
}