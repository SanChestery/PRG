package ch.hslu.informatik.prg.block07.afg01;

public class EnItUebersetzer extends Uebersetzer {

	public EnItUebersetzer(String name, String vorname, String email, String muttersprache, String fremdsprache,
			double stundenansatz) {
		super(name, vorname, email, muttersprache, fremdsprache, stundenansatz);
	}

	@Override
	public void uebersetze() {
		System.out.println("\n Sono pronto ... ");
	}

}
