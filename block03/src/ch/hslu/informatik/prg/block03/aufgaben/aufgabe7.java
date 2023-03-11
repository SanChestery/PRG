package ch.hslu.informatik.prg.block03.aufgaben;

import java.util.Scanner; 

public class aufgabe7 {

	public static void main(String[] args) {
		
		// Deklaration Vairablen
		int laengeArray; 
		int n; 
		int sum = 0; 
		int min = 1000; 
		
		// Deklaration Array
		int[] zufallsZahlen; 
		
		// Deklaration Scanner
		Scanner sc = new Scanner(System.in);
		
		// Einlesen Array length
		System.out.print("Bitte Array länge eingeben: "); 
		laengeArray = sc.nextInt();
		
		zufallsZahlen = new int [laengeArray];

		// Array Befüllung
		for (int i = 0; i < laengeArray; i++) {
			
			// Generierung Zufallszahl
			n = 1 + (int)(Math.random() * 1000);
			
			zufallsZahlen[i] = n; 
			System.out.println("Auf dem Index " + i + " liegt die Zufallszahl: " + zufallsZahlen[i]);
			
			if (n < min) {
				min = n; 
			}
			
			sum += n; 
		}
		
		// Ausgabe kleinste Zahl im Array
		System.out.println("Die Kleinste aller im Array enthaltenen Zahlen ist: " + min);
		
		// Summe aller Arrays
		System.out.println("Die Summe aller im Array enthaltenen Zahlen ist: " + sum);
	}

}
