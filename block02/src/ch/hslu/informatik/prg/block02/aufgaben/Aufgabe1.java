package ch.hslu.informatik.prg.block02.aufgaben;

import java.util.Scanner; 

public class Aufgabe1 {

	public static void main(String[] args) {
		//Deklaration Variablen
		double machineOutputPerHour;
		double machineCostPerHour;
		double loanPerHour; 
		double fixedCostsPerOrder;
		double totalUnits;
		
		double totalHours;
		
		//Deklaration Scanner
		Scanner sc = new Scanner(System.in);
		
		//Fixe Angaben für Machinen und Lohnkosten
		machineCostPerHour = 10; 
		loanPerHour = 12;
		
		//Einlesen von Produktionsleistung
		System.out.print("Bitte Dauer der Produktion angeben (Stk/h): ");
		machineOutputPerHour = sc.nextDouble();
		
		//Einlesen von Anzahl Einheiten
		System.out.print("Bitte Anzahl zu produzierenden Einheiten angeben (Stk): ");
		totalUnits = sc.nextDouble();
				
		//Berechnungen
		totalHours = totalUnits * machineOutputPerHour;
		
		
		if (totalUnits < 100) {
			fixedCostsPerOrder = (machineCostPerHour + loanPerHour) * totalHours * 1.2;
			System.out.println("Da Sie Mindermengen (unter 100) bestellen müssen wir leider 20% aufschlagen.");
		} else if (totalUnits >= 1000) {
			fixedCostsPerOrder = (machineCostPerHour + loanPerHour) * totalHours * 0.95;
			System.out.println("Da Sie mehr als 1000 Einheiten bestellen, erhalten Sie automatisch 5% Rabat auf Ihre Bestellung.");
		} else {
			fixedCostsPerOrder = (machineCostPerHour + loanPerHour) * totalHours;
		}
		
		
		//Ausgabe
		System.out.println("Der Aufwand beträgt " + totalHours + " pro Stunde. Zu unserem aktuellen Maschinensatz von " + machineCostPerHour + " CHF/Std und unserem aktuellen Lohnsatz von " + loanPerHour + " CHF/Std kommen wir auf einen Gesamtbetrag von " + fixedCostsPerOrder + " CHF");
		
		// Schliessung Scanner
		sc.close();
		
	}

}
