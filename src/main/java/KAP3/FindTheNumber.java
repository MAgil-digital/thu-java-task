package src.main.java.KAP3;

import java.util.Random;
import java.util.Scanner;

public class FindTheNumber {
    public static void main(String[] args) {


        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int randommNumber = rand.nextInt(101);



        for(int i = 0; i<10; i++)
        {
            System.out.println("Geben Sie Ihre Zahl ein: ");
            int yourGuess = scan.nextInt();

            if(yourGuess == randommNumber)
            {
                System.out.println("Die Zahl ist richtig!");
                //schleife stoppen
                break;
            } else if (yourGuess > randommNumber) {
                System.out.println("Deine Zahl ist zu groß!");
            } else if (yourGuess < randommNumber) {
                System.out.println("Deine Zahl ist zu klein!");
            }

        }
    }

}
