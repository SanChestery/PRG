package ch.hslu.informatik.prg.block06.aufgaben; 

public class Sachbearbeiter extends Mitarbeiter {

    // Attribute
    int anstellungsJahr; 

    // Konstruktor
    public Sachbearbeiter(String name, int anstellungsJahr) 
    {
        super(name);
        this.level = "Sachbearbeiter"; 
        this.anstellungsJahr = anstellungsJahr; 
        setLohn(); 
    }

    // Setter & Getter
    public void setAnstellungsJahr(int anstellungsJahr) {
        this.anstellungsJahr = anstellungsJahr;
        setLohn();
    }

    public int getAnstellungsJahr() {
        return anstellungsJahr;
    }

    // Andere Methoden
    public void setLohn() {
        if (anstellungsJahr <= 0) {
            this.lohn = grundlohn; 
        } else {
            this.lohn = grundlohn + grundlohn * (thisYear - anstellungsJahr) / 100;
        } 
    }

    public void getOutput() {
        System.out.println("\n" + this.getLevel() + " " + this.name + ":\n Anstellungsjahr:\t" + this.anstellungsJahr + "\n Lohn:\t\t\t" + this.lohn + " CHF");
    }
}
