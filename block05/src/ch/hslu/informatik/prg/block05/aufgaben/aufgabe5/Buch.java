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
	public Buch ( String titel, String autor, int erscheinungJahr, int auflage) {
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

	public void setBuchNummer(int nr) {
		this.buchNummer = nr; 
	}

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
