package ch.hslu.informatik.prg.block05.aufgaben.aufgabe5;

public class BuchTest {

	public static void main(String[] args) {
		
		// Array definition
		String[][] buchInstanzen = new String[3][5];
		
		// Erstellung Buch-Instanzen
		Buch buch1 = new Buch( "Harry Potter 1", "JK Roling", 1999, 1);
		Buch buch2 = new Buch( "Sherlock Holmes", "Arthur Conan Doile", 1934, 2);
		Buch buch3 = new Buch( "The hobbit", "JRR Tolkien", 1968, 18); 

		// Array befüllung
		buchInstanzen[0][0] = Integer.toString(buch1.getBuchNummer());
		buchInstanzen[0][1] = buch1.getTitel();
		buchInstanzen[0][2] = buch1.getAutor();
		buchInstanzen[0][3] = Integer.toString(buch1.getErscheinungJahr());
		buchInstanzen[0][4] = Integer.toString(buch1.getAuflage());

		buchInstanzen[1][0] = Integer.toString(buch2.getBuchNummer());
		buchInstanzen[1][1] = buch2.getTitel();
		buchInstanzen[1][2] = buch2.getAutor();
		buchInstanzen[1][3] = Integer.toString(buch2.getErscheinungJahr());
		buchInstanzen[1][4] = Integer.toString(buch2.getAuflage());

		buchInstanzen[2][0] = Integer.toString(buch3.getBuchNummer());
		buchInstanzen[2][1] = buch3.getTitel();
		buchInstanzen[2][2] = buch3.getAutor();
		buchInstanzen[2][3] = Integer.toString(buch3.getErscheinungJahr());
		buchInstanzen[2][4] = Integer.toString(buch3.getAuflage());
 

		// Ausgabe BuchInstanzen

		for(int i = 0; i < 3; i++) {
			System.out.println(
				"Buchnummer: " + buchInstanzen[i][0] + 
				"\nTitel: " + buchInstanzen[i][1] + 
				"\nAutor: " + buchInstanzen[i][2] + 
				"\nErscheinungsjahr: " + buchInstanzen[i][3] + 
				"\nAuflage: " + buchInstanzen[i][4] + 
				"\n"
				);
		}
	}
}
