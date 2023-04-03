package ch.hslu.informatik.prg.block05.aufgaben.aufgabe5;

public class Buch {
	
	private int buchNummer;
	private String titel;
	private String autor;
	private int erscheinungJahr;
	private int auflage;
	
	
	public Buch() {
	
	}
	
	
	// Konstruktor
	public Buch ( int buchNummer, String titel, String autor, int erscheinungJahr, int auflage) {
		this.buchNummer = buchNummer;
		this.titel = titel;
		this.autor = autor;
		this.erscheinungJahr = erscheinungJahr;
		this.auflage = auflage;
	}
	
	// Setter & Getter Methoden
	public int getBuchNummer() {
		return buchNummer; 
	}
	
	public String getTitel() {
		return titel; 
	}
	
	public String getAutor() {
		return autor; 
	}
	
	public int getErscheinungJahr() {
		return erscheinungJahr; 
	}
	
	public int getAuflage() {
		return auflage; 
	}
}
