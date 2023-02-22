package ch.hslu.informatik.prg.block01.aufgabe3;

import java.util.Scanner;

public class Aufgbae3 {

	public static void main(String[] args) {
		int zahl1;
		int zahl2;
		int min; 
		int max; 
		int minMaxSumme;
		int summe; 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Erste Zahl eingeben: ");
		zahl1 = sc.nextInt();
		
		System.out.print("Zweite Zahl eingeben: ");
		zahl2 = sc.nextInt();
		
		// Bestimmung von Min und Max
		if (zahl1 < zahl2 ) {
			min = zahl1;
			max = zahl2;
		} else if (zahl1 > zahl2) {
			min = zahl2;
			max = zahl1;
		} else {
			System.out.println("Zahlen sind die gleichen! Abbruch");
			return;
		}
		
		
		//Summe von Min und Max
		minMaxSumme = min + max;
		
		//Generelle Summe
		
		summe = 0; 
		for(int i = min + 1; i < max; i++) {
			summe = summe + i; 
		}
		
		
		//Ausgabe
		System.out.println("");
		System.out.println("###### Ausgabe:");
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		System.out.println("Summe aus Minimum und Maximum: " + minMaxSumme);
		System.out.println("Summe aller Zahlen zwischen Minimum und Maximum: " + summe);

	}

}
