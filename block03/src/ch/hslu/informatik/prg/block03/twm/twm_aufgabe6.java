package ch.hslu.informatik.prg.block03.twm;

import java.util.Scanner;

public class twm_aufgabe6 {

	public static void main(String[] args) {

		// Scanner deklaration
		Scanner sc = new Scanner(System.in);
		
		// Einlesen ganzer Zahl
		System.out.print("Eine ganze Zahl einlesen: ");
		int n = sc.nextInt();
		
		/*
		while (n > 0) {
			System.out.println(n + " * " + n + " = " + (n * n ));
			n--;
		}
		*/
		
		/*
		 * Teilaufgabe 1: 
		 * 3 * 3 = 9
		 * 2 * 2 = 4
		 * 1 * 1 = 1
		 */
		
		/* Teilaufgabe 2: 
		for (;n > 0; n--) {
			System.out.println(n + " * " + n + " = " + (n * n ));
		}
		*/
		
		do {
			
			System.out.println(n + " * " + n + " = " + (n * n ));
			n--; 
			
		} while (n > 0);
			
		/*
		 * Teilaufgabe 4:
		 * Mit allen Schleifen kann theoretisch das gleiche Ziel erreicht werden. Sie unterscheiden sich teils lediglich in Logik und Geschwindigkeiten
		 */


		// Schliessung Scanner
		sc.close();
	}

}
