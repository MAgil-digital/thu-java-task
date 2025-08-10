package src.main.java.KAP2;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args){

        float weight;
        double height;
        double bmi;

        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie ihr Gewicht ein: ");
        weight = scan.nextFloat();
        System.out.print("Geben Sie ihre Groesse in Meter ein: ");
        height = scan.nextFloat();

        bmi = weight/(Math.pow(height,2));

        
        if(bmi < 20)
        {
            System.out.print("BMI = " + bmi + " >>>> You are underweight!");
        } else if (20 <= bmi && bmi < 25)
        {
            System.out.print("BMI = " + bmi + " >>>> You have normal weight!");
        } else if(25 <= bmi && bmi < 30){
            System.out.print("BMI = " + bmi + " >>>> You are overweight!");
        } else if(30 <= bmi && bmi < 40){
            System.out.print("BMI = " + bmi + " >>>> You are strongly overweight!");
        } else System.out.print("BMI = " + bmi + " You are extremly overweight!");


    }
}
