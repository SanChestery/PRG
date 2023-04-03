package ch.hslu.informatik.prg.block05.aufgaben.aufgabe2;

public class Lampe {

	// Definition Attribute
	private int spannungVolt; 
	private int leistungWatt;
	private String leuchtmittel; 
	private String schalterStatus;
	
	// Definition Schalter
	Schalter sch = new Schalter();
	
	// Setter Methoden
	
	public void setSpannungVolt(int inputSpannung) {
		spannungVolt = inputSpannung; 
	}
	
	public void setLeistungWatt(int inputLeistung) {
		leistungWatt = inputLeistung; 
	}
	
	public void setLeuchtmittel(String bezeichnungLeuchtmittel) {
		leuchtmittel = bezeichnungLeuchtmittel; 
	}
	
	// Getter Methoden
	
	public int getSpannungVolt() {
		return spannungVolt; 
	}
	
	public int getLeistungWatt() {
		return leistungWatt; 
	}
	
	public String getLeuchtmittel() {
		return leuchtmittel; 
	}
	
	public String getSchalterStatus() {
		if (sch.isEingeschaltet() == true) {
			schalterStatus = "EINGESCHALTET";
		} else {
			schalterStatus = "AUSGESCHALTET";
		}
		
		return schalterStatus; 
	}
	
	// parametrisierter Konstruktor
	
	public Lampe (int volt, int watt, String lm) {
		spannungVolt = volt; 
		leistungWatt = watt; 
		leuchtmittel = lm; 
	}
	
}
