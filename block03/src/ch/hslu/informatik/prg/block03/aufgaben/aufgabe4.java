package ch.hslu.informatik.prg.block03.aufgaben;

import java.util.Scanner;

public class aufgabe4 {

	public static void main(String[] args) {
		
		// Declare Variables
		int upper; 
		int lower; 
		
		// Declare Scanner
		Scanner sc = new Scanner(System.in);
		
		// Read input
		System.out.print("Bitte Obergrenze eingeben: ");
		upper = sc.nextInt();
		
		System.out.print("Bitte Untergrenze eingeben: ");
		lower = sc.nextInt();

		// Schliessung Scanner
		sc.close();

		// Output
		System.out.println("Ausgabe: ");
		for (; upper >= lower; upper--) {
			System.out.print(" " + upper);
		}
	}

}
