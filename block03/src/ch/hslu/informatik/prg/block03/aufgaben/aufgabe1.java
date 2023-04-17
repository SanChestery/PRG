package ch.hslu.informatik.prg.block03.aufgaben;

import java.util.Scanner; 

public class aufgabe1 {

	public static void main(String[] args) {

		// Deklaration Variablen
		double startKapital; 
		double jahre; 
		double zinssatzInProzent; 
		double endKapital; 
		
		// Deklaration Scanner
		Scanner sc = new Scanner(System.in);
		
		// Input startKaptial
		System.out.print("Startkapital eingeben: ");
		startKapital = sc.nextDouble();
		
		// Input Jahre
		System.out.print("Anzahl Jahre eingeben: ");
		jahre = sc.nextDouble();

		// If zinssatz
		/*
		System.out.print("Zinssatz in Prozent eingeben: ");
		 zinssatzInProzent = sc.nextDouble();
		 */
		if (startKapital < 10000) {
			zinssatzInProzent = 0.75;
		} else if (startKapital < 100000) {
			zinssatzInProzent = 0.25;
		} else {
			zinssatzInProzent = 0.5; 
		}
	
		// Enkapital berechnen und Ausgeben
		endKapital = startKapital * Math.pow((1 + zinssatzInProzent / 100), jahre);
		
		// Output
		System.out.println("\nMit einem Kapital von " + startKapital + " CHF und einem Zinssatz von " + zinssatzInProzent + "% während " + jahre + " Jahren, ergibt dies ein Endkapital von: " + endKapital + " CHF");
		
		// Schliessung Scanner
		sc.close();

	}

}
