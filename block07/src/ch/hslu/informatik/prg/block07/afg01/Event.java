package ch.hslu.informatik.prg.block07.afg01;

import java.time.LocalDate;
import java.time.LocalTime;

public class Event {

	private String eventName;
	private String eventBeschreibung;
	private String location;
	private LocalDate datum;
	private LocalTime startzeit;
	private int dauerInMinuten;
	private Uebersetzer[] uebersetzerListe = new Uebersetzer[3];
	private Teilnehmer[] teilnehmerListe = new Teilnehmer[3];
	private Person eventOwner;

	private int teilnehmerIndex = 0;
	private int uebersetzerIndex = 0;

	public Event(String eventName, String eventBeschreibung, String location, LocalDate datum, LocalTime startzeit,
			int dauerInMinuten, Person eventOwner) {
		this.eventName = eventName;
		this.eventBeschreibung = eventBeschreibung;
		this.location = location;
		this.datum = datum;
		this.startzeit = startzeit;
		this.dauerInMinuten = dauerInMinuten;
		this.eventOwner = eventOwner;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventBeschreibung() {
		return eventBeschreibung;
	}

	public void setEventBeschreibung(String eventBeschreibung) {
		this.eventBeschreibung = eventBeschreibung;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}

	public LocalTime getStartzeit() {
		return startzeit;
	}

	public void setStartzeit(LocalTime startzeit) {
		this.startzeit = startzeit;
	}

	public int getDauerInMinuten() {
		return dauerInMinuten;
	}

	public void setDauerInMinuten(int dauerInMinuten) {
		this.dauerInMinuten = dauerInMinuten;
	}

	public Uebersetzer[] getUebersetzerListe() {
		return uebersetzerListe;
	}

	public Teilnehmer[] getTeilnehmerListe() {
		return teilnehmerListe;
	}

	public Person getEventOwner() {
		return eventOwner;
	}

	public void setEventOwner(Person eventOwner) {
		this.eventOwner = eventOwner;
	}

	public void teilnehmerHinzufuegen(Teilnehmer teilnehmer) {

		if (!(teilnehmerIndex < teilnehmerListe.length)) {

			/* Array um ein Element vergrössern */
			Teilnehmer[] tempArray = new Teilnehmer[teilnehmerListe.length + 1];
			System.arraycopy(teilnehmerListe, 0, tempArray, 0, teilnehmerListe.length);
			teilnehmerListe = tempArray;
		}

		teilnehmerListe[teilnehmerIndex++] = teilnehmer;
	}

	public void uebersetzerHinzufugen(Uebersetzer uebersetzer) {

		if (!(uebersetzerIndex < uebersetzerListe.length)) {
			/* Array um ein Element vergrössern */
			Uebersetzer[] tempArray = new Uebersetzer[uebersetzerListe.length + 1];
			System.arraycopy(uebersetzerListe, 0, tempArray, 0, uebersetzerListe.length);
			uebersetzerListe = tempArray;
		}

		uebersetzerListe[uebersetzerIndex++] = uebersetzer;
	}

	public void teilnehmerEntfernen(int index) {
		if (index >= 0 && index < teilnehmerIndex) {
			// Shift all elements from the right of the removed element to the left
			System.arraycopy(teilnehmerListe, index + 1, teilnehmerListe, index, teilnehmerIndex - index - 1);
	
			// Decrease the index since we've removed an element
			teilnehmerIndex--;
	
			// Create a new array with one less slot
			Teilnehmer[] tempArray = new Teilnehmer[teilnehmerListe.length - 1];
			
			// Copy the elements (except the last one, since we've removed an element)
			System.arraycopy(teilnehmerListe, 0, tempArray, 0, teilnehmerIndex);
			
			// Replace the old array with the new, smaller one
			teilnehmerListe = tempArray;
		} else {
			// Throw an exception or handle the error appropriately if the index is out of bounds
			System.out.println("Index out of bounds. No Teilnehmer removed.");
		}
	}

	public void uebersetzerHinzufuegen(Uebersetzer uebersetzer) {
		if (!(uebersetzerIndex < uebersetzerListe.length)) {
			/* Array um ein Element vergrössern */
			Uebersetzer[] tempArray = new Uebersetzer[uebersetzerListe.length + 1];
			System.arraycopy(uebersetzerListe, 0, tempArray, 0, uebersetzerListe.length);
			uebersetzerListe = tempArray;
		}
		uebersetzerListe[uebersetzerIndex++] = uebersetzer;
	}
	
	public void uebersetzerEntfernen(int index) {
		if (index >= 0 && index < uebersetzerIndex) {
			// Shift all elements from the right of the removed element to the left
			System.arraycopy(uebersetzerListe, index + 1, uebersetzerListe, index, uebersetzerIndex - index - 1);
	
			// Decrease the index since we've removed an element
			uebersetzerIndex--;
	
			// Create a new array with one less slot
			Uebersetzer[] tempArray = new Uebersetzer[uebersetzerListe.length - 1];
			
			// Copy the elements (except the last one, since we've removed an element)
			System.arraycopy(uebersetzerListe, 0, tempArray, 0, uebersetzerIndex);
			
			// Replace the old array with the new, smaller one
			uebersetzerListe = tempArray;
		} else {
			// Throw an exception or handle the error appropriately if the index is out of bounds
			System.out.println("Index out of bounds. No Uebersetzer removed.");
		}
	}
	
}
