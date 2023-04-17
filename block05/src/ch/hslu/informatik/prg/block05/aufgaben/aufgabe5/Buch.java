package ch.hslu.informatik.prg.block05.aufgaben.aufgabe5;

public class Buch {
	
	private static int buchNummerCounter = 0;
	private int buchNummer;
	private String titel;
	private String autor;
	private int erscheinungJahr;
	private int auflage;
	
	// Standard Konstruktor
	public Buch(int buchNummer) {
		buchNummerCounter++; 
		this.buchNummer = buchNummerCounter; 
	}
		
	// Konstruktor
	public Buch (String titel, String autor, int erscheinungJahr, int auflage) {
		buchNummerCounter++; 
		this.buchNummer = buchNummerCounter; 
		this.titel = titel;
		this.autor = autor;
		this.erscheinungJahr = erscheinungJahr;
		this.auflage = auflage;
	}
	
	// Getter Methoden
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


	/* Setter Methoden */
	public void setTitel(String tit) {
		this.titel = tit; 
	}

	public void setAutor(String aut) {
		this.autor = aut; 
	}
	
	public void setErscheinungJahr(int jahr) {
		this.erscheinungJahr = jahr; 
	}

	public void setAuflage(int auf) {
		this.auflage = auf; 
	}
}
