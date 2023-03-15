package ch.hslu.informatik.prg.block04.twm;

public class twm_aufgabe5_TestClass {
	public static void main(String[] args) {
		
		// Aufruf erste show Methode
		twm_aufgabe5.show("Ausgabe erste show Methode");
		
		// Aufruf zweite show Methode
		twm_aufgabe5.show("Ausgabe zweite show Methode", 123.45);
		
		// Aufruf dritte show Methode
		int[] arr = {10, 20, 30, 40, 50};
		twm_aufgabe5.show("Ausgabe dritte show Methode", arr);

		// Aufruf max Methode
		int res; 
		res = twm_aufgabe5.max(10, 20);
		System.out.println("Das max der beiden Zahlen ist: " + res);
	}
}
