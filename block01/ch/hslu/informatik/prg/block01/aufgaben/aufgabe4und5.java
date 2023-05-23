package ch.hslu.informatik.prg.block01.aufgaben;

import java.util.Scanner;

public class aufgabe4und5 {

	public static void main(String[] args) {
		//Variablen 
		double guthaben;
		double zinsSatz;
		double guthabenMitZinsen;
		double zinsen;
		
		//Eingabe
		Scanner sc = new Scanner(System.in);
		System.out.print("Geben Sie ein Guthaben ein: ");
		guthaben = sc.nextDouble();
		
		Scanner scZinssatz = new Scanner(System.in);
		System.out.print("Geben Sie einen Zinssatz ein: ");
		zinsSatz = sc.nextDouble();
		
		//Verarbeitung 
		guthabenMitZinsen = Math.round(guthaben * (1 + zinsSatz / 100));
		zinsen = Math.round(guthabenMitZinsen - guthaben);
		
		//Ausgabe
		System.out.println("Zinsen im ersten Jahr: " + zinsen + "CHF");
		System.out.println("Guthaben nach einem Jahr: " + guthabenMitZinsen + "CHF");
	}

}

/*
Das Program berechnet das Guthaben nach anwendung des Zinseffekts
Der Zinssatz ist nicht dynamisch

*/