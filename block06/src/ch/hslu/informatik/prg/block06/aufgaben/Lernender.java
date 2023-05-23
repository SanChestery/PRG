package ch.hslu.informatik.prg.block06.aufgaben;

public class Lernender extends Mitarbeiter{
    
    // Attribute
    int ausbildungsJahr; 
    
    // Kontstruktor
    public Lernender(String name, int ausbildungsJahr) 
    {
        super(name);
        this.level = "Lernender";
        this.ausbildungsJahr = ausbildungsJahr; 
        this.setLohn();
    }

    // Setter & Getter
    public void setAusbildungsJahr(int ausbildungsJahr) {
        this.ausbildungsJahr = ausbildungsJahr;
        setLohn();
    }

    public int getAusbildungsJahr() {
        return ausbildungsJahr;
    }

    // Andere Methoden
    public void setLohn() {
        if (ausbildungsJahr == 1) {
            this.lohn = grundlohn * 0.15; 
        } else if (ausbildungsJahr == 2) {
            this.lohn = grundlohn * 0.25; 
        } else if (ausbildungsJahr == 3) {
            this.lohn = grundlohn * 0.30; 
        }
    }

    public void getOutput() {
        System.out.println("\nLernender " + this.name + ":\n Ausbildungsjahr:\t" + this.ausbildungsJahr + "\n Lohn:\t\t\t" + this.lohn + " CHF");
    }
}
