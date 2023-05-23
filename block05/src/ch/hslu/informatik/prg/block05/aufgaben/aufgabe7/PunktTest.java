package ch.hslu.informatik.prg.block05.aufgaben.aufgabe7;

public class PunktTest {
    public static void main(String[] args) {
        
        // Erste Instanz mit standard Konstruktor
        Punkt punkt1 = new Punkt(); 

        punkt1.setX(10);
        punkt1.setY(12);

        // Zweite Instanz mit definiertem Konstruktor
        Punkt punkt2 = new Punkt(15, 5); 

        // Output
        System.out.println("Die erste Instanz hat die Werte\nX: " + punkt1.getX() + "\tY: " + punkt1.getY()); 
        System.out.println("Die zweite Instanz hat die Werte\nX: " + punkt2.getX() + "\tY: " + punkt2.getY());
    }
}
