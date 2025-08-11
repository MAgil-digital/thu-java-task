package src.main.java.KAP2;

import java.util.Scanner;

public class SchaltjahrCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int schaltjahr;

        System.out.print("Jahr eingeben: ");
        schaltjahr = scan.nextInt();

        /* Funktioniert aber ist nicht effizient
        if(schaltjahr%4 == 0){
            if(schaltjahr%100 == 0 && schaltjahr%400 == 0){
                System.out.print(schaltjahr + " ist ein Schaltjahr! ");
            } else if (schaltjahr%100 == 0){
                System.out.print(schaltjahr + " ist kein Schaltjahr!");
            } else {
                System.out.print(schaltjahr  + " ist ein Schaltjahr");
            }
        } else System.out.print( schaltjahr +  " ist kein Schaltjahr!");

       */

        if (schaltjahr % 400 == 0){
            System.out.println("ist ein Schaltjahr");
        } else if(schaltjahr % 100 == 0){
            System.out.println("Kein Schaltjahr!");
        } else if(schaltjahr % 4 == 0){
            System.out.println("Ist ein Schaltjahr");
        } else System.out.println("Kein Schaltjahr");



    }
}
