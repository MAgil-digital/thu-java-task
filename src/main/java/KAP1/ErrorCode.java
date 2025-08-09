package src.main.java.KAP1;

import java.util.Scanner;

// Find the 8 Mistakes
public class ErrorCode {
    public static void main(String[] args) {
        // FEHLER 1 - System.out falsch
        // Scanner scan = new Scanner(System.out);

        //Korrektur
        Scanner scan = new Scanner((System.in));

        //Fehler 2 - Komma falsch
        //double pi = 3,1415;

        //Korrektur
        double pi = 3.1415;
        System.out.print("Radius: ");
        double radius = scan.nextDouble();

        //Fehler 3- Semikolon fehlt
        //System.out.print("Height: ")

        //Korrektur
        System.out.print("Height: ");
        double height = scan.nextDouble();
        double circumference = 2 * pi * -(-radius);

        //Fehler 4 - ^ nicht zulässig
        //double baseArea = pi * radius ^ 2;

        //korrektur
        double baseArea = pi * radius * radius;

        double lateralSurfaceArea = circumference * height;
        double surface = 2 * baseArea + lateralSurfaceArea;
        double volume = baseArea * height;

        //Fehler 5 - " fehlt
        //System.out.println("Circumference: + circumference);

        //Korrektur
        System.out.println("Circumference: " + circumference);
        System.out.println("Base Area: " + baseArea);

        //Fehler 6  - LateralSurfaceArea muss klein geschrieben sein
        //System.out.println("Lateral Surface Area: "+LateralSurfaceArea);

        //Korrektur
        System.out.println("Lateral Surface Area: "+lateralSurfaceArea);

        //Fehler 7 - Das Plus fehlt bei surface
        //System.out.println("Surface: " surface);

        //Korrektur
        System.out.println("Surface: " + surface);

        //Fehler 8 - Klammer fehlt nach volume
        //System.out.println("Volume: "+volume;

        //Korrektur
        System.out.println("Volume: "+volume);
    }
}
