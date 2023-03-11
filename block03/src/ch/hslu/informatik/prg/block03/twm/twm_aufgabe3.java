package ch.hslu.informatik.prg.block03.twm;

public class twm_aufgabe3 {

	public static void main(String[] args) {

		// Declare char array
		char[] helloWorld = {'H', 'a', 'l', 'l', 'o', ' ', 'W', 'e', 'l', 't', '!'};

		// Ausgabe length Array
		System.out.println("Länge Array: " + helloWorld.length);
		
		// Ausgabe Hello World
		for (int i = 0; i < helloWorld.length; i++) {
			System.out.print(helloWorld[i]);
		}
		
		System.out.println("");
		
		// Ausgabe gespiegelt
		for (int i = 10; i >= 0; i--) {
			System.out.print(helloWorld[i]);
		}
		
	}
}
