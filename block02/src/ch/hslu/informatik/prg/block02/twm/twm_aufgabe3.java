package ch.hslu.informatik.prg.block02.twm;

public class twm_aufgabe3 {
//OutputDemo
	
	public static void main(String[] args) {
		//Variablen für zwei ganze Zahlen definieren
		int a = 5, b = 10; 
		
		//Summe der beiden Zahlen ausgeben: Variante 1 -> Ausgabe: Summe: 510
		System.out.println("Summe: " + a + b);
		
		//Summe der beiden Zahlen ausgeben: Variante 2 -> Ausgabe: Summe: 15
		System.out.println("Summe: " + (a + b));
		
		//Summe der beiden Zahlen ausgeben: Variante 3 -> Ausgabe: Summe: 15
		int summe = a + b; 
		System.out.println("Summe: " + summe);
	
		//Summe der beiden Zahlen ausgeben: Variante 4 -> Ausgabe: 5 + 10 = 15
		System.out.println(a + " + " + b + " = " + (a + b));
	}
}
