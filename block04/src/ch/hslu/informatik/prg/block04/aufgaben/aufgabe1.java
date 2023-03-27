package ch.hslu.informatik.prg.block04.aufgaben;

public class aufgabe1 { // Nach Teilaufgabe 3 eigentlich Modul benannt. 
	public int dauerModul;  
	public int anzahlStudierende;  
	public String Klassenzimmer; 
	public boolean streamVerfügbar; 
	
	aufgabe1_dozent dozentModul = new aufgabe1_dozent();
}

/* Teilaufgabe 1: 
 * Da ein solches Modul mehrere Attribute mit sich trägt und entsprechend weiter zerlegt werden kann
 * 
 * Teilaufgabe 2:
 * Beispielsweise die Dauer, die Dozenten, die Studierenden, der Unterrichtsort, ob ein Stream verfügbar ist. All dies kann anhand einer UML Klasse beschrieben werden
 * 
 */