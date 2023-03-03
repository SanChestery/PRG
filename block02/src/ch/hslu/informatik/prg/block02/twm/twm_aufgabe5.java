package ch.hslu.informatik.prg.block02.twm;

public class twm_aufgabe5 {

	public static void main(String[] args) {
		// Teilaufgabe 1
		int a = 10; 
		int b = 20; 
		
		// int resultat = a > b; -> Ist Syntaktisch nicht korrekt, da kein Int sondern ein Boolean zurück gegeben wird.
		boolean resultat = a > b; 
		System.out.println(resultat);
		
		//Teilaufgabe 2
		int c = 10; 
		long d = 100; 
		
		System.out.println(c + " < " + d + ": " + (c < d)); //Ist syntaktisch korrekt, da ein Long sich in einen Integer konvertieren lassen kann
		//Rückgabewert ist ein boolean
		
		//Teilaufgabe 3
		int e = 10; 
		int f = 100; 
		int g = 1000; 
		
		boolean x = e > 0; 
		boolean y = g < f && e * f > g; 
		
		System.out.println(x + "" + y); // X wird true sein, Y wird false sein

		//Teilaufgabe 4
		boolean h = false; 
		int i = 5; 
		int j = 10; 
		int k = 100; 
		
		//Resultat (res) berechnen
		boolean resH = h & i < j & i * j < k;
		boolean resI = h && i < j && i * j < k;
		
		int resK = i > j ? 1000 : 2000; 
		
		System.out.println(resH + " " + resI + " " + resK);

		/*
		 * Code ist syntaktisch richtig, der einfache hört jedoch bei der UND Überprüfung nicht direkt auf sobald eine Möglichkeit falsch ist. 
		 * Die && Anweisung wird daher deutlich schneller verarbeitet
		 * Die Variable erhält den Wert da die Kondition falsch ist. 
		 */
	}

}
