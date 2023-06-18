package ch.hslu.informatik.prg.block07.afg01;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {

	public static void main(String[] args) {
		/*
		 * Mitarbeiter, der für die Organisation und Durchchführung zuständig ist
		 * (eventOwner)
		 */
		Person eventOwner = new Person("Pfister", "Max", "mpfister@gmx.ch");

		Event javaNeuerungen = new Event("Java 9 - Neuerungen", "Einführung in Java 9", "Rösslimatte 52, Luzern",
				LocalDate.of(2017, 8, 30), LocalTime.of(18, 0), 180, eventOwner);

		EventManager eManager = new EventManager();

		eManager.eventOrganisieren(javaNeuerungen);
	}

}
