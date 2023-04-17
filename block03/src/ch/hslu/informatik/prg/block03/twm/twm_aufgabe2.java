package ch.hslu.informatik.prg.block03.twm;

public class twm_aufgabe2 {

	public static void main(String[] args) {
		// Deklaration Array
		int[] primes = {19, 17, 13, 11, 7, 5, 3, 2, 1};
			// Typ kann ein Int sein, da lediglich ganze Zahlen verwendet werden
			// Das Array hat eine legnth von 9
		
		// Array length ausgeben
		System.out.println("Anzahl Primzahlen zwischen 20 und 1: " + primes.length);
		
		// Ausgabe Array
		System.out.println("Alle Primzahlen: \n" + primes[0] + "\n" + primes[1] + "\n" + primes[2] + "\n" + primes[3] + "\n" + primes[4] + "\n" + primes[5] + "\n" + primes[6] + "\n" + primes[7] + "\n" + primes[8]);
		
		// Ausgabe kleinste und grösste Primzahl
		System.out.println("Kleinste einstellige Primzahl: " + primes[8]);
		System.out.println("Grösste zweistellige Primzahl: " + primes[0]);
		
		// Summe aller Primzahlen
		int sum = 0; 
		for (int i = 0; i < primes.length; i++) {
			sum += primes[i]; 
		}
		System.out.println("Summe aller Primzahlen: " + sum);
	}

}
