package ch.hslu.informatik.prg.block07.afg01;

public abstract class Uebersetzer extends Person {

	private String muttersprache;
	private String fremdsprache;
	private double stundenansatz;

	public Uebersetzer(String name, String vorname, String email, String muttersprache, String fremdsprache,
			double stundenansatz) {
		super(name, vorname, email);
		this.muttersprache = muttersprache;
		this.fremdsprache = fremdsprache;
		this.stundenansatz = stundenansatz;
	}

	public String getMuttersprache() {
		return muttersprache;
	}

	public void setMuttersprache(String muttersprache) {
		this.muttersprache = muttersprache;
	}

	public String getFremdsprache() {
		return fremdsprache;
	}

	public void setFremdsprache(String fremdsprache) {
		this.fremdsprache = fremdsprache;
	}

	public double getStundenansatz() {
		return stundenansatz;
	}

	public void setStundenansatz(double stundenansatz) {
		this.stundenansatz = stundenansatz;
	}

	/**
	 * Übersetzt die Rede des Referats
	 */
	public abstract void uebersetze();

	public static final String DEUTSCH = "Deutsch";
	public static final String ENGLISCH = "Englisch";
	public static final String FRANZOESISCH = "Französisch";
	public static final String ITALIENISCH = "Italienisch";
}
