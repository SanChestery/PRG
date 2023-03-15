package ch.hslu.informatik.prg.block04.twm;

public class twm_aufgabe5 {

	public static void show(String message) {
		System.out.println(message);
	}
	
	public static void show(String message, double value) {
		System.out.println(message + " und " + value);		
	}
	
	public static void show(String message, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(message + " und " + arr[i]);
		}
	}
	
	public static int max(int a, int b) {
		return a > b ? a : b; 	
		
	}
}

/* 
 * Sehen Sie sich die Methoden der Klasse MyClass an. Um was für Methoden handelt es sich? Klassenmethoden oder Instanzmethoden (Objektmethoden)? Und, an Hand von was können Sie dies eindeutig sagen?
 * 		Es handelt sich hierbei Instanzvariablen, man kann es erkennen anhand der deklaration "static"
 * 
 * Nehmen wir an, dass Sie jede einzelne Methode aufrufen möchten. Wie machen Sie es? Brauchen Sie zuvor eine Instanz der Klasse MyClass, oder ist diese nicht nötig?
 * 		Um die Methoden aufzurufen, braucht es eine Instanz der Klasse MyClass
 * 
 * Was versteht man eigentlich unter einem sinnvollen Aufruf?
 * 		Ein Aufruf welcher in einem real-life Szenario tatsächlich anzutreffen wäre
 */