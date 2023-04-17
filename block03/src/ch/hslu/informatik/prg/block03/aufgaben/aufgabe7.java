package ch.hslu.informatik.prg.block03.aufgaben;

import java.util.Scanner; 

public class aufgabe7 {

	public static void main(String[] args) {
		
		// Deklaration Vairablen
		int laengeArray; 
		int n; 
		int sum = 0; 
		int min = 1000; 
		int j = 0; 
		int countGerade = 0; 
		int a; 
		
		// Deklaration Arrays
		int[] zufallsZahlen; 
		int[] zufallsZahlenGerade; 
		
		// Deklaration Scanner
		Scanner sc = new Scanner(System.in);
		
		// Einlesen Array length
		System.out.print("Bitte Array länge eingeben: "); 
		laengeArray = sc.nextInt();
		
		zufallsZahlen = new int [laengeArray];

		// Erstes Array: Befüllung
		for (int i = 0; i < laengeArray; i++) {
			
			// Generierung Zufallszahl
			n = 1 + (int)(Math.random() * 1000);
			
			zufallsZahlen[i] = n; 
			System.out.println("Auf dem Index " + i + " liegt die Zufallszahl: " + zufallsZahlen[i]);
			
			if (n < min) {
				min = n; 
			}
			
			sum += n; 		
			
			if (n % 2 == 0) {
				countGerade++; 
			}
		}
		
		// Ausgabe kleinste Zahl im Array
		System.out.println("Die Kleinste aller im Array enthaltenen Zahlen ist: " + min);
		
		// Summe aller Arrays
		System.out.println("Die Summe aller im Array enthaltenen Zahlen ist: " + sum);
		
		// Initialisierung zweites Array 
		zufallsZahlenGerade = new int [countGerade];
		
		// Zweites Array: Befüllung
		for (int k = 0; k < zufallsZahlen.length; k++) {
			
			if (zufallsZahlen[k] % 2 != 0) {
				
				zufallsZahlenGerade[j] = zufallsZahlen[k];
				System.out.println(zufallsZahlenGerade[j]);
				j++;
				
			}
			
		}
		
		// Ausgabe letzte ungerade Zahl
		for (int l = zufallsZahlen.length - 1; l >= 0; l--) {
			if (zufallsZahlen[l] % 2 != 0) {
				System.out.println("Die letzte ungerade Zahl des Arrays lautet: " + zufallsZahlen[l]); 
				break; 
			} else if (l == 0) {
				System.out.println("Im Array sind keine Primzahlen enthalten.");
			}
		}
		
		// Ausgabe aller Primzahlen
		
		for (int m = zufallsZahlen.length - 1; m >= 0; m--) {
			a = zufallsZahlen[m];
			if (a == 2) {
				System.out.println(a + " ist eine Primzahl!");
			}
			for (int o = a - 1; o > 1 ; o--) {
				if (a % o == 0) {
					break; 
				} else if (o == 2) {
					System.out.println(a + " ist eine Primzahl!");
				}
			}
		}

		// Schliessung Scanner
		sc.close();
	}

}
