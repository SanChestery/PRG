package ch.hslu.informatik.prg.block03.twm;

import java.util.Scanner;

public class twm_aufgabe5 {

	public static void main(String[] args) {
		/*
		 * Teilaufgabe 1: 
		 * Kopfgesteuerte Schleifen führen Anweisungen im Rumpf aus, wenn der Bedingungsausdruck im Schleifkopf true ergibt. Fussgesteuerte Schleifen führt zuerst die Anweisungen im Schleifenrumpf aus und falls der Schleifenkopf immernoch true ergibt führt er den Rumpf erneut eus
		 * 
		 * for und while sind kopfgesteuerte Schleifen, do ... while ist eine Fussgesteuerte Schleife
		 */
		
		/* Teilaufgabe 2 */
		
		// Variable deklaration
		int number;
		
		// Scanner deklaration
		Scanner sc = new Scanner(System.in);
		
		// Einlesen Zahl
		System.out.println("Bitte geben Sie eine ganze Zahl ein: ");
		number = sc.nextInt();
		
		// Ausgabe aller zahlen bis und mit number
		System.out.println("Alle Zahlen von 0 bis " + number + ":");
		for (int i = 0; i <= number; i++) {
			System.out.println(i);
		}
		
		// Ausgabe aller zahlen in umgekehrter Reihenfolge
		System.out.println("Alle Zahlen von " + number + " bis 0:");
		for (int j = number; j >= 0; j--) {
			System.out.println(j);
		}

		// Schliessung Scanner
		sc.close();
	}

}
