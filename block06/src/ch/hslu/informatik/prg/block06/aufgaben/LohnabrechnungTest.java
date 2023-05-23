package ch.hslu.informatik.prg.block06.aufgaben; 

public class LohnabrechnungTest {
    
    public static void main(String[] args) {
        Lernender MWeber = new Lernender("Marco Weber", 1);
        MWeber.getOutput();

        Sachbearbeiter UKaufmann = new Sachbearbeiter("Urs Kaufmann", 2023);
        UKaufmann.getOutput();

        Leiter TLindauer = new Leiter("Thomas Lindauer", 2023);
        TLindauer.getOutput();

        MWeber.setAusbildungsJahr(2);
        MWeber.getOutput();

        UKaufmann.setAnstellungsJahr(2016);
        UKaufmann.getOutput();

        TLindauer.setAnstellungsJahr(2016);
        TLindauer.getOutput();
    
        System.out.println("");

        // Befüllung Array
        String[][] MALoene = new String[3][2]; 
        MALoene[0][0] = MWeber.getName(); 
        MALoene[0][1] = Double.toString(MWeber.getLohn());

        MALoene[1][0] = UKaufmann.getName(); 
        MALoene[1][1] = Double.toString(UKaufmann.getLohn());

        MALoene[2][0] = TLindauer.getName(); 
        MALoene[2][1] = Double.toString(TLindauer.getLohn());

        for (int i = 0; i < 3; i++) {
            System.out.print("Gehalt ");
            for (int j = 0; j < 2; j++) {
                System.out.print(" " + MALoene[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
