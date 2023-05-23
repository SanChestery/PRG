package ch.hslu.informatik.prg.block05.aufgaben.aufgabe7;

public class Punkt {
    // Variables
    int x; 
    int y; 

    // Standard Constructor
    public Punkt(){

    }; 

    // Konstruktor
    public Punkt(int x, int y) {
        this.x = x;
        this.y = y; 
    }

    // Setter
    void setX(int x) {
        this.x = x; 
    }

    void setY(int y) {
        this.y = y;
    }

    // Getter
    int getX() {
        return x; 
    }

    int getY() {
        return y; 
    }
}
