package ch.hslu.informatik.prg.block06.aufgaben;

public abstract class Mitarbeiter {
    
    // Attribute
    String name; 
    String level; 
    double lohn; 
    final int grundlohn = 6000; 
    final int thisYear = 2023; 

    // Konstruktor
    public Mitarbeiter(String name) {
        this.name = name; 
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setLohn(int lohn) {
        this.lohn = lohn;
    }



    // Getter
    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public double getLohn() {
        return lohn;
    }

    public int getGrundlohn() {
        return grundlohn;
    }
}
