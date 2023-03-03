package ch.hslu.informatik.prg.block02.twm;

public class twm_aufgabe4 {
	/*
	 * Teilaufgabe 1:
	 * Ist nicht korrekt da Int keine Kommazahlen verarbeiten kann, eine float beschreibt eine Zahl mit der Potenz 2^X und ein char speichert lediglich einen einzigen Buchstaben
	 */
	public static void main(String[] args) {
	//Teilaufgabe 2
	double a = 2;
	double b = 5;
	double x = b / a;
	double y = a / b;
	
	System.out.println(b + " / " + a + " = " + x);
	System.out.println(a + " / " + b + " = " + y);
	}
}
