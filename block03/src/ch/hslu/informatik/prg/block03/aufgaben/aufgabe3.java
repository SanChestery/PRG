package ch.hslu.informatik.prg.block03.aufgaben;

import java.util.Scanner; 

public class aufgabe3 {

	public static void main(String[] args) {
		
		// Declare variables
		double height; 
		double weight; 
		double bmi; 
		String description = "";
		
		// Declare Scanner 
		Scanner sc = new Scanner(System.in);
		
		// Input
		System.out.print("Please enter your height in CM: ");
		height = sc.nextDouble();
		
		System.out.print("Please enter your weight in Kilos: ");
		weight = sc.nextDouble();
		
		// Calc BMI
		height /= 100; 
		bmi = weight / (height * height);
		
		if (bmi < 18.5) {
			description = "under weight";
		} else if (bmi < 25) {
			description = "normal weight";
		} else if (bmi < 30) {
			description = "over weight";
		} else if (bmi > 30) {
			description = "adipositas";
		}
		
		System.out.println("Your BMI is: " + bmi + " (" + description + ") ");
		
		

	}

}
