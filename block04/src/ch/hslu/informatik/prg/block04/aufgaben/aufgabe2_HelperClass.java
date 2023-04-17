package ch.hslu.informatik.prg.block04.aufgaben;

import java.util.Random;
import java.util.Scanner; 

public class aufgabe2_HelperClass {

	public static void main(String[] args) {
		
		// show Array Aufruf
		String[] arrayEins = {"Wort Eins", "Wort Zwei", "Wort Drei"};
		show(arrayEins);
		
		// create Array Aufruf
		int[] arr = create(5, 2, 20);
		for (int i = 0; i < arr.length; i++)	
			System.out.println(arr[i]);
		
		// min Aufruf
		double minimum = min(10.1, 12.2, 18.3);
		System.out.println("Das minimum ist: " + minimum);
		
		// readInt Aufruf
		int inputInt = readInt();
		System.out.println("Sie haben " + inputInt + " eingegeben");
		
		// readInt mit Message Aufruf
		int inputIntZwei = readInt("Bitte geben Sie Ihre Zahl ein: ");
		System.out.println("Sie haben " + inputIntZwei + " eingegeben");
		
		// merge Aufruf
		double[] toMergeArrayEins = {10, 15, 20, 30};
		double[] toMergeArrayZwei = {18, 212, 06, 21};
		double[] mergedArray = merge(toMergeArrayEins, toMergeArrayZwei);
		
		for (int i = 0; i < mergedArray.length; i++) {
			System.out.print(mergedArray[i] + " ");
		}
		
		System.out.println("");
		// contains aufruf
		int[] containsArr = {10, 11, 12, 13};
		
		boolean res = contains(containsArr, 9);
		
		if (res == true) {
			System.out.println("Die Nummer ist im Array enthalten");
		} else {
			System.out.println("Die Nummer ist nicht im Array enthalten");
		}
	}
	
	
	/*
	 * Zeigt den Inhalt eines übergebenen Arrays auf dem Bildschirm an
	 * 
	 * @param stringArray 	das übergebene Array
	 */
	public static void show(String[] stringArray) {
		System.out.println("Ausgabe eingegebenen Arrays");
		for (int i = 0; i < stringArray.length; i++)
			System.out.println(stringArray[i]);
	}
	
	/*
	 * Erstellt ein Array mit der spezifischen Länge und initialisiert es mit den Int-Werten, die sich in dem durch die Parameter from und to definierten Bereich befinden.
	 * 
	 * @param length	die Lämnge des Arrays
	 * @param from		die untere Grenze des Bereichs, aus dem die Zufallswerte genommen werden dürfen
	 * @param to		die obere Grenze des Bereichs, aus dem die Zufallswerte genommen werden dürfen
	 * 
	 * @return 			das Array
	 */
	public static int[] create(int length, int from, int to) {
		
		int[] newArray = new int[length];
		
		for (int i = 0; i < length; i++) {
			
			Random rand = new Random();
			newArray[i] = rand.nextInt(to - from + 1) + from;
			
		}
		
		return newArray;  
	}
	
	/*
	 * Liefert den kleinesten der übergebenen Werte (Minimum) zurück
	 * 
	 * @param a 		der erste Wert
	 * @param b			der zweite Wert
	 * @param c			der dritte Wert
	 * 
	 * @return			der kleinste Wert (Minimum)
	 */
	
	public static double min(double a, double b, double c) {
	
		// Implementierung
		
		double minimum; 
		
		if (a < b && a < c ) {
			minimum = a; 
		} else if (b < a && b < c) {
			minimum = b; 
		} else if (c < a && c < b) {
			minimum = c;
		} else {
			System.out.println("Es gibt mehrere minimum Werte");
			minimum = 111.111;
		}
	
		return minimum;
		
	}
	
	/*
	 * Liest einen Int-Wert von der Tastatur und liefert sie zurück
	 * 
	 * @return 			der eingelesene int-Wert
	 */
	
	public static int readInt() {
		
		// Implementierung
		System.out.print("Bitte geben Sie eine Zahl ein: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		return input; 
	}
	
	/*
	 * Liest einen int-Wert von der Tastatur und liefert sie zurück.
	 * 
	 * @param message	die Meldung, die vor dem Einlesen angezeigt wird
	 * 
	 * @return			der eingelesene int-Wert
	 */
	
	public static int readInt(String message) {
		
		// Implementierung
		System.out.print(message);
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();	
		return input; 
	

		
	}
	
	/*
	 * Fügt die beiden übergebenen Arrays zusammen und liefert das resultierende Array zurück. 
	 * 
	 * @param firstArray	day erste Array
	 * @param secondArray	das zweite Array
	 * 
	 * @return				das resultierende Array
	 */
	
	public static double[] merge(double[] firstArray, double[] secondArray) {
		
		// Implementierung
		double[] newArr = new double[firstArray.length + secondArray.length]; 
		for (int i = 0; i < firstArray.length + secondArray.length; i++) {
			if (i < firstArray.length) {
				newArr[i] = firstArray[i];
			} else {
				newArr[i] = secondArray[i - firstArray.length];
			}
		}
		
		return newArr; 
	}
	
	/*
	 * Sagt, ob der übergeben value-Wert im übergebenen Array enthalten ist
	 * 
	 * @param arr	das Array, das untersucht werden soll
	 * @param value	der Wert, für den bestimmt werden soll, ob er in dem spezifizierten Array enthalten ist oder nicht
	 * 
	 * @return		das Resultat (enthalten oder nicht)
	 */
	
	public static boolean contains(int[] arr, int value) {
		
		// Implementierung
		boolean isContain = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (value == arr[i]) {
				isContain =  true;
			}
		}
		return isContain; 
		
	}
}

/*
 * Teilaufgabe 2: 
 * Man erkennt eine klassenmethode anhand der static aussage. Eine Klassenmethode wird üblicherweise mit dem Methodenname(PARAMETER); aufgerufen.
 * 
 */
