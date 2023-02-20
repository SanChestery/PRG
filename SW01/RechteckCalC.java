package SW01;

// Import der Scanner Klasse zur Einlesung von Imput
import java.util.Scanner;

// Einfache Klasse zur Berechnung eines Dreiecks 
public class RechteckCalC {
    public static void main(String[] args) {
        
        // starten des Scanners 
        Scanner sc =  new Scanner(System.in);

        // Methode zur Einlesung der Breite
        System.out.print("Breite eingeben: ");
        double breite = sc.nextDouble();
        
        // Methode zur Einlesung der Länge
        System.out.print("Länge eingeben: ");
        double laenge = sc.nextDouble();

        // Berechnung der Fläche 
        double flaeche = breite * laenge;

        // Ausgabe der Fläche
        System.out.print("Fläche: " + flaeche + "m");

        // Schliessung des Scanners
        sc.close();

    }
}
