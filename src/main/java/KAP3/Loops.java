package src.main.java.KAP3;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Loops {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int i = 0;

        System.out.println("Schreiben Sie Ihren Satz: ");
        String deinSatz = scan.nextLine();

        System.out.println("Wie oft soll Ihr satz wiederholt werden: ");
        int wdh = scan.nextInt();

        System.out.println("For Schleife >>>>");
        for(int j = 0; j < wdh ; j++){
            System.out.println(deinSatz);
        }

        while (i < wdh){
            System.out.println(deinSatz + "Schleife While");
            i++;
        }

        i = 0;

        do {
            System.out.println(deinSatz + "Schleife Do-While");
            i++;
        } while (i < wdh);


    }
}
