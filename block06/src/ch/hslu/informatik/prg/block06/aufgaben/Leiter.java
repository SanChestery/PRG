package ch.hslu.informatik.prg.block06.aufgaben;

public class Leiter extends Sachbearbeiter{
    
    // Attribute 
    double bonus; 
    final double bonusSatz = 0.15; 

    // Konstruktor
    public Leiter(String name, int anstellungsjahr) {
        super(name, anstellungsjahr);
        this.level = "Leiter"; 
        setLohn();
        setBonus();
    }
    
    // Setter & Getter
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    // Andere Methoden
    @Override
    public void setAnstellungsJahr(int anstellungsJahr) {
        super.setAnstellungsJahr(anstellungsJahr);
        setBonus();
    }
    
    public void setBonus() {
        bonus = this.lohn * bonusSatz; 
        this.lohn += bonus;  
    }
}
