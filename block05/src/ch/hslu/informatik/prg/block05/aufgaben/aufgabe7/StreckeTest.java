package ch.hslu.informatik.prg.block05.aufgaben.aufgabe7;

public class StreckeTest {
    public static void main(String[] args) {
        
        // Erste Instanz mit standard Konstruktor
        Strecke strecke1 = new Strecke(); 
        
        strecke1.startpunkt.setX(15);
        strecke1.startpunkt.setY(12);

        strecke1.endpunkt.setX(19);
        strecke1.endpunkt.setY(20);

        System.out.println("Die erste Strecke hat folgende Punkte:\nStartpunkt: X(" + strecke1.startpunkt.getX() + ") Y(" + strecke1.startpunkt.getY() + ")\tEndpunkt: X(" + strecke1.endpunkt.getX() + ") Y(" + strecke1.endpunkt.getY() + ")");
        System.out.println("Länge: " + strecke1.laenge() + "\tMittelpunkt: X(" + strecke1.mittelpunkt().getX() + ") Y(" + strecke1.mittelpunkt().getY() + ")\n"); 
    
        // Zweite Instanz mit standard Konstruktor
        Punkt start = new Punkt(10, 15); 
        Punkt ende = new Punkt(20, 22); 
        Strecke strecke2 = new Strecke(start, ende); 
            
        System.out.println("Die zweite Strecke hat folgende Punkte:\nStartpunkt: X(" + strecke2.startpunkt.getX() + ") Y(" + strecke2.startpunkt.getY() + ")\tEndpunkt: X(" + strecke2.endpunkt.getX() + ") Y(" + strecke2.endpunkt.getY() + ")");
        System.out.println("Länge: " + strecke2.laenge() + "\tMittelpunkt: X(" + strecke2.mittelpunkt().getX() + ") Y(" + strecke2.mittelpunkt().getY() + ")"); 
    
    }
}
