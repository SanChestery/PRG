package ch.hslu.informatik.prg.block02.aufgaben;

import java.util.Scanner;
import java.lang.Math;

public class Aufgabe2 {

	public static void main(String[] args) {
		/* Scanner erstellen */
		Scanner sc = new Scanner(System.in);
		
		/* Startkapital einlesen*/
		System.out.print("Bitte Startkapital eingeben: ");
		double startKapital = sc.nextDouble();
		
		/* Zinssatz einlesen */
		System.out.print("Bitte Zinssatz in Prozent eingeben: ");
		double zinssatz = sc.nextDouble();
		
		/*Anzahl Jahre einlesen */
		System.out.print("Bitte Anzahl Jahre eingeben: ");
		double anzahlJahre = sc.nextDouble();
		
		/* Endkapital berechnen und Ausgeben */
		double endKapital = startKapital * Math.pow((1 + zinssatz / 100) , anzahlJahre);
		System.out.println("Endkapital: " + endKapital);
		
		/* Schliessung Scanner */
		sc.close();
	}

}
