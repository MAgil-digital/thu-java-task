package src.main.java.KAP1;

import java.util.Scanner;

public class WillkommenFremder {
    public static void main(String[] args){

        // Here the user enters his name and is then greeted
        System.out.print("Guten Tag, geben Sie bitte Ihren Namen ein: ");
        Scanner Scanner = new Scanner(System.in);

        String Name = Scanner.nextLine();

        System.out.print("Guten Tag " + Name + "!");
    }
}