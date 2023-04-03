package ch.hslu.informatik.prg.block05.aufgaben.aufgabe1;

public class LampeTest {

	public static void main(String[] args) {
		
	// Initialisierung lampeA
		// Setzen der Werte, da sie im Konstruktor erwartet werden 
		Lampe lampeA = new Lampe(1, 1, "NULL");

		// Ausgabe Initial Objekt
		System.out.println("Spannung: " + lampeA.getSpannungVolt() + " V, Leistung: " + lampeA.getLeistungWatt() + " W, Fassung-Typ: " + lampeA.getLeuchtmittel());
		
		// Setzen der spezifischen Werte
		lampeA.setSpannungVolt(24); 
		lampeA.setLeistungWatt(40);
		lampeA.setLeuchtmittel("E14");
		
		// Ausgabe neu gesetzte Werte
		System.out.println("Spannung: " + lampeA.getSpannungVolt() + " V, Leistung: " + lampeA.getLeistungWatt() + " W, Fassung-Typ: " + lampeA.getLeuchtmittel());
		
	// Initialisierung lampeB
		Lampe lampeB = null; 
		lampeB = new Lampe(220, 60, "G-27");
		
		// Ausgabe Initial Objekt
		//System.out.println("Spannung: " + lampeB.getSpannungVolt() + " V, Leistung: " + lampeB.getLeistungWatt() + " W, Fassung-Typ: " + lampBA.getLeuchtmittel());
		
		// Ausgabe neu gesetzte Werte
		System.out.println("Spannung: " + lampeB.getSpannungVolt() + " V, Leistung: " + lampeB.getLeistungWatt() + " W, Fassung-Typ: " + lampeB.getLeuchtmittel());
				
		
	}

}
