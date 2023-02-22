package ch.hslu.informatik.prg.block01.aufgaben;

public class aufgabe3 {

	public static void main(String[] args) {
		// Variablen
		double guthaben = 1000; 
		double zinsSatz = 3;
		double guthabenMitZinsen = 0; 
		
		//Verarbeitung
		guthabenMitZinsen = guthaben * (1 + zinsSatz / 100);
		
		//Ausgabe
		System.out.println(guthabenMitZinsen);

	}

}
