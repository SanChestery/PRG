package ch.hslu.informatik.prg.block04.aufgaben;

public class aufgabe1_ModulTest {

	public static void main(String[] args) {
		
		// Instanzierung von Klasse aufgabe 1
		aufgabe1 Mathematik = new aufgabe1(); 
		aufgabe1 Programmieren = new aufgabe1();
		aufgabe1_dozent mathematikDozent = new aufgabe1_dozent();
		aufgabe1_dozent programmierenDozent = new aufgabe1_dozent();
		

		// initialisierung der Attribute von Mathematik
		Mathematik.anzahlStudierende = 15; 
		Mathematik.dauerModul = 150; 
		Mathematik.Klassenzimmer = "Zimmer 404";
		Mathematik.streamVerfügbar = true; 
		mathematikDozent.dozentVorname = "Markus";
		mathematikDozent.dozentNachname = "Müller";
		mathematikDozent.dozentTitel = "Prof. Dr.";
		
		
		// initialisierung der Attribute von Programmieren
		Programmieren.anzahlStudierende = 50; 
		Programmieren.dauerModul = 150; 
		Programmieren.Klassenzimmer = "Zimmer 301";
		Programmieren.streamVerfügbar = false; 
		programmierenDozent.dozentVorname = "Florian";
		programmierenDozent.dozentNachname = "Meier";
		programmierenDozent.dozentTitel = "Dr.";

		// Output
		System.out.println("Das Mathematik Modul, betreut von " + mathematikDozent.dozentTitel + " " + mathematikDozent.dozentVorname + " " + mathematikDozent.dozentNachname + ", findet im " + Mathematik.Klassenzimmer + " statt. Es nehmen insgesamt " + Mathematik.anzahlStudierende + " Studierende teil und das Modul dauert " + Mathematik.dauerModul + " Minuten.");
		System.out.println("Das Programmieren Modul, betreut von " + programmierenDozent.dozentTitel + " " + programmierenDozent.dozentVorname + " " + programmierenDozent.dozentNachname + ", findet im " + Programmieren.Klassenzimmer + " statt. Es nehmen insgesamt " + Programmieren.anzahlStudierende + " Studierende teil und das Modul dauert " + Programmieren.dauerModul + " Minuten.");
	}

}
