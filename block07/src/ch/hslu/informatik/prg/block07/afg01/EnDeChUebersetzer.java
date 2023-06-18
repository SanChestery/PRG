package ch.hslu.informatik.prg.block07.afg01;

public class EnDeChUebersetzer extends EnDeUebersetzer {

	public EnDeChUebersetzer(String name, String vorname, String email, String muttersprache, String fremdsprache,
			double stundenansatz) {
		super(name, vorname, email, muttersprache, fremdsprache, stundenansatz);
	}

	@Override
	public void uebersetze() {
		System.out.println("\n Wart s momentli! Bin chli au so wiiit ...");
	}

}
