package ch.hslu.informatik.prg.block03.twm;

import java.util.Scanner;

public class twm_aufgabe4 {
	public static void main(String[] args) {
		// Scanner Objekt erstellen
		Scanner sc = new Scanner(System.in); 
		
		// Variablen deklarieren
		int ersteZahl; 
		int zweiteZahl;
		
		// Einlesen ersteZahl
		System.out.print("Bitte erste Zahl eingeben: ");
		ersteZahl = sc.nextInt();
		
		// Falls Positiv/negativ
		if (ersteZahl > 0) {
			System.out.println("Sie haben " + ersteZahl + " eingegeben. Diese Zahl ist POSITIV");
		} else if (ersteZahl < 0) {
			System.out.println("Sie haben " + ersteZahl + " eingegeben. Diese Zahl ist NEGATIV");
		} else {
			System.out.println("Sie haben die Zahl 0 eingegeben");
		}
		
		// Einlesen zweiteZahl
		System.out.print("Bitte zweite Zahl eingeben: ");
		zweiteZahl = sc.nextInt();
		
		//zweiteZahl grösser oder kleiner als ersteZahl
		if (ersteZahl > zweiteZahl) {
			System.out.println("Die erste Zahl ist grösser");
		} else if (ersteZahl < zweiteZahl) {
			System.out.println("Die zweite Zahl ist grösser"); 
		} else {
			System.out.println("Beide zahlen sind gleich");
		}
	}	
}
