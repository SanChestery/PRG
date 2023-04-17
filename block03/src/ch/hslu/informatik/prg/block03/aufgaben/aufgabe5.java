package ch.hslu.informatik.prg.block03.aufgaben;

import java.util.Scanner; 

public class aufgabe5 {

	public static void main(String[] args) {
		
		/* Teilaufgabe 1 */
		
		// Deklaration Variablen
		int a; 
		int b; 
		int c; 
		
		// Deklaration Scanner 
		
		Scanner sc = new Scanner(System.in);
		
		// Werte Input
		
		System.out.print("Bitte ersten Wert eingeben: ");
		a = sc.nextInt();
		
		System.out.print("Bitte zweiten Wert eingeben: ");
		b = sc.nextInt();
		
		System.out.print("Bitte dritten Wert eingeben: ");
		c = sc.nextInt();
		
		// Output
		if (a > b || a < (b / 2) || (a + c) > b) {
			System.out.println("Genf");
		}
		
		/* Teilaufgabe 2 */
		
		// Deklarieren der Variablen
		boolean x; 
		boolean y; 
		
		System.out.print("Erster Boolean angeben: "); 
		x = sc.nextBoolean();
		
		System.out.print("Zweiter Boolean angeben: ");
		y = sc.nextBoolean();
		
		// Output
		if ( (a > b || (a - c) > 0) && x != y) {
			System.out.println("Bern");
		}
		
		/* Teilaufgabe 3 */
		
		// Output
		
		if ( ( (a / 2) % 2 == 1) || ( (b - c) % 2 == 0) || a != b && b != c) {
			System.out.println("Lugano");
		}
		
		// Schliessung Scanner
		sc.close();

	}

}
