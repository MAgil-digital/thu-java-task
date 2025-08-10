package src.main.java.KAP2;

import java.util.Scanner;

public class GreaterSmallEqual {
    public static void main(String [] arg) {


    int number1;
    int number2;

    Scanner scan = new Scanner(System.in);

    System.out.print("Geben Sie die erste Zahl ein: ");
    number1 =  scan.nextInt();

    System.out.print("Geben Sie die zweite Zahl ein: ");
    number2 =  scan.nextInt();

    if(number1 > number2){
        System.out.print(number1 + " Ist groesser als " + number2);
    } else if (number2 > number1){
        System.out.print(number2 + " Ist groesser als " + number1 );
    } else {
        System.out.print("Beide Zahlen sind gleich gross!");
    }

    }

}