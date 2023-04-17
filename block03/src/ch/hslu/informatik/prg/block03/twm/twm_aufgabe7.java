package ch.hslu.informatik.prg.block03.twm;

import java.util.Scanner; 

public class twm_aufgabe7 {

	public static void main(String[] args) {
		
		// Scanner deklaration
		Scanner sc = new Scanner(System.in);
		
		// Einlesen ganzer Zahl
		System.out.print("Bitte eine ganze Zahl eingeben: ");
		int zahl = sc.nextInt();
		
		/* Teilaufgabe 1 
		 * Antwort für 2 
		 * 	Aktueller Wert: 2 -> Codefragment A
		 * 	Aktueller Wert: 1 -> Codefragment A
		 * 	Aktueller Wert: 0 -> Codefragment B
		 * 
		 *  Antwort für -2
		 * 	Aktueller Wert: -2 -> Codefragment B
		 */ 
		
		while (zahl > 0) {
			System.out.println("Aktueller Wert: " + zahl);
			zahl--;
		}
		
		
		System.out.println(" ");
		
		do {
			System.out.println("Aktueller Wert: " + zahl);
			zahl--;
		} while (zahl > 0);

		// Schliessung Scanner
		sc.close();
	}

}
