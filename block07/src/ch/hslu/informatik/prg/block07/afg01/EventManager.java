package ch.hslu.informatik.prg.block07.afg01;

public class EventManager {

	int index = 0;

	private Event[] events = new Event[1024];

	public void eventOrganisieren(Event event) {
		events[index++] = event;

		// Ausschreibung machen ...

		// Teilnehmer-Anmeldungen entgegennehmen ...
		event.teilnehmerHinzufuegen(new Teilnehmer("Weber", "Marco", "mweber@gmx.ch", Teilnehmer.ENTWICKLER));
		event.teilnehmerHinzufuegen(new Teilnehmer("Sicher", "Frranz", "fsicher@gmx.ch", Teilnehmer.PROJEKTLEITER));
		event.teilnehmerHinzufuegen(new Teilnehmer("Walker", "Peter", "pwalker@gmx.ch", Teilnehmer.ENTWICKLER));
		event.teilnehmerHinzufuegen(new Teilnehmer("Aregger", "Thomas", "taregger@gmx.ch", Teilnehmer.ENTWICKLER));
		event.teilnehmerHinzufuegen(new Teilnehmer("Beeler", "Patrik", "pbeeler@gmx.ch", Teilnehmer.SW_ARCHITEKT));
		event.teilnehmerHinzufuegen(new Teilnehmer("Fischer", "Tom", "tfischer@gmx.ch", Teilnehmer.ANDERS));

		// Übersetzer organisieren ...
		event.uebersetzerHinzufugen(
				new EnDeUebersetzer("May", "Theresa", "tmay@gmail.com", Uebersetzer.ENGLISCH, Uebersetzer.DEUTSCH, 90));
		event.uebersetzerHinzufugen(new EnFrUebersetzer("Sarkozy", "Nicolas", "nsarkozy@gmail.com",
				Uebersetzer.FRANZOESISCH, Uebersetzer.ENGLISCH, 110));
		event.uebersetzerHinzufugen(new EnItUebersetzer("Paolo", "Gentiloni", "pgentiloni@gmail.com",
				Uebersetzer.ITALIENISCH, Uebersetzer.ENGLISCH, 100));
		event.uebersetzerHinzufugen(new EnDeChUebersetzer("Zgraggen", "Josef", "jzgraggen@bluewin.ch",
				Uebersetzer.ITALIENISCH, Uebersetzer.ENGLISCH, 100));

		// Durchführen wenn es so weit ist ...
		Uebersetzer[] arrUebersetzer = event.getUebersetzerListe();
		for (Uebersetzer refCurrentUebersetzer : arrUebersetzer) {
			if (refCurrentUebersetzer != null) {
				refCurrentUebersetzer.uebersetze();
			}
		}
	}

}
