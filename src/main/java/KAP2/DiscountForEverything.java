package src.main.java.KAP2;

import java.util.Scanner;

public class DiscountForEverything {
    public static void main(String[] args){

        double preisKG;
        int bestellmenge;
        double gesamtPreis;

        Scanner scan = new Scanner(System.in);

        System.out.print("Wie viel soll ein Kilogramm kosten: ");
        preisKG = scan.nextDouble();

        System.out.print("Wie viel Kilogramm wollen Sie bestellen: ");
        bestellmenge = scan.nextInt();


        System.out.println("Preis pro KG: " + preisKG);
        System.out.println("Bestellmenge: " + bestellmenge);
        gesamtPreis = preisKG * bestellmenge;
        System.out.println("Gesamtpreis: "+ gesamtPreis);

        switch (bestellmenge){

            case 10:
                System.out.println("Preis pro KG: " + preisKG);
                System.out.println("Bestellmenge: " + bestellmenge);
                System.out.println("Rabatt: 10%");
                System.out.println("Gesamtpreis mit 10% Rbaatt: "+ gesamtPreis * 0.9);
                break;

            case 50:
                System.out.println("Preis pro KG: " + preisKG);
                System.out.println("Rabatt: 50%");
                System.out.println("Bestellmenge: " + bestellmenge);
                System.out.println("Gesamtpreis mit 50% Rbaatt: "+ gesamtPreis * 0.5);
                break;
        }







    }
}
