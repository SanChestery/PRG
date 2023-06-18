package ch.hslu.informatik.prg.block07.afg01;

public class Teilnehmer extends Person {

	private String rolle;

	public Teilnehmer(String name, String vorname, String email, String rolle) {
		super(name, vorname, email);
		this.rolle = rolle;
	}

	public String getRolle() {
		return rolle;
	}

	public void setRolle(String rolle) {
		this.rolle = rolle;
	}

	public static final String ENTWICKLER = "Entwickler";
	public static final String SW_ARCHITEKT = "SW Architekt";
	public static final String PROJEKTLEITER = "Projektleiter";
	public static final String ANDERS = "Anders";

}