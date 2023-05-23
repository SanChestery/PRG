package ch.hslu.informatik.prg.block05.aufgaben.aufgabe7;

import java.lang.Math;

public class Strecke extends Punkt {
    
    //Attribute
    Punkt startpunkt = new Punkt();
    Punkt endpunkt = new Punkt();

    // Konstruktoren
    public Strecke() {

    }

    public Strecke(Punkt startPunkt, Punkt endPunkt) {
        this.startpunkt = startPunkt; 
        this.endpunkt = endPunkt; 
    }

    // Setter
    public void setStartpunkt(Punkt startpunkt) {
        this.startpunkt = startpunkt;
    }

    public void setEndpunkt(Punkt endpunkt) {
        this.endpunkt = endpunkt; 
    }

    // Getter 
    public Punkt getStartpunkt() {
        return startpunkt;
    }

    public Punkt getEndpunkt() {
        return endpunkt;
    }

    // Andere Methoden
    public double laenge() {
        return Math.sqrt(Math.pow(endpunkt.x - startpunkt.x, 2) + Math.pow(endpunkt.y - startpunkt.y, 2)); 
    }
    
    public Punkt mittelpunkt() {
        Punkt m = new Punkt();
        m.setX(startpunkt.x + (endpunkt.x - startpunkt.x)/2);
        m.setY(startpunkt.y + (endpunkt.y - startpunkt.y)/2);
        return m; 
    }
}
