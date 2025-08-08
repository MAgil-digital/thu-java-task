package src.main.java.KAP1;

import java.util.Scanner;

public class RadiusUmfangBerechnen {
    public static void main(String [] args) {

        double Umfang;
        double Flaeche;
        double FlaecheMitPow;
        double PI = 3.14159;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie den Radius ein: ");
        double radius = scanner.nextDouble();

        Umfang = ((2 * PI) * radius);
        Flaeche = ((2 * PI)* (radius * radius));

        //oder mit Math.pow()
        FlaecheMitPow = ((2 * PI) * Math.pow(radius,2));


        System.out.println("Wenn dein Radius "+radius+" ist dann ist dein Umfang "+ Umfang+"!");
        System.out.println("Wenn dein Radius "+radius+" ist dann ist deine Flache "+ Flaeche+"!");
        System.out.println("Wenn dein Radius "+radius+" ist dann ist deine Flache welche mit der Funktion POW berechnet wurde "+ FlaecheMitPow+"!");

    }
}
