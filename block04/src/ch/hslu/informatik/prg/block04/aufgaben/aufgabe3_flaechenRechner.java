package ch.hslu.informatik.prg.block04.aufgaben;

import java.lang.Math; 

public class aufgabe3_flaechenRechner {

	public static void main(String[] args) {
		
		/* Radius */
		double radius = 5;
		
		/* Seitenlaenge eines Quadrats */
		int seiteLaenge = 10;
		
		/* Breite und Hoehe eines Rechteck */
		int breite = 25;
		int hoehe = 4;
		
		/* Kreisflaeche berechnen */
		double flaecheKreis = aufgabe3_flaechenRechner.berechneFlaeche(radius);
		
		/* Quadratflaeche berechnen */
		double flaecheQuadrat = aufgabe3_flaechenRechner.berechneFlaeche(seiteLaenge);
		
		/* Rechteckflaeche berechnen */
		long flaecheRechteck = aufgabe3_flaechenRechner.berechneFlaeche(breite, hoehe);
		
		/* Ausgaben */
		System.out.printf("Kreisflaeche: %8.2f\n", flaecheKreis);
		System.out.printf("Quadratflaeche: %8.2f\n", flaecheQuadrat);
		System.out.println("Rechteckflaeche: " + flaecheRechteck);
		

	}
	
	/*
	 * a. Hierbei handelt es sich um überladene Methoden
	 * b. Anhand der Signatur der Methode welche durch den Datentyp, den Namen sowie der Parameter gebildet wird
	 * c. Als Klassenmethode, durch die spezifizierung static
	 * 
	 * Teilfaufgabe 2: 
	 * Durch den gegebenen Namen vor der Parameter Klammer
	 * Der Typ wird immer direkt vor dem Namen der Methode definiert
	 * Die Parameterliste ist immer in der Klammer hinter dem Methoden-Namen definiert
	 * Ja, da der Typ immer mit angegeben werden muss
	 * Ja, da dieser immer bei der definition angegeben wird
	 */
	
	public static double berechneFlaeche(double r) {
		return r * Math.PI;		
	}
	
	public static int berechneFlaeche(int l) {
		return l * l; 
	}
	
	public static int berechneFlaeche(int h, int l) {
		return h * l; 
	}
	

}
