package ch.hslu.informatik.prg.block03.aufgaben;

import java.util.Scanner;

public class aufgabe6 {

	public static void main(String[] args) {

		// Deklaration Variablen
		int a; 
		
		// Deklaration Scanner
		Scanner sc = new Scanner(System.in); 
		
		// Input
		System.out.print("Bitte geben Sie eine mögliche Primzahl ein: ");
		a = sc.nextInt();
		
		// Calc
		if (a <= 0) {
			System.out.println("Eingabe nicht gültig"); 
		} else {
			if (a == 2) {
				System.out.println(a + " ist eine Primzahl!");
			}
			for (int i = a - 1; i > 1 ; i--) {
				if (i == 2) {
					System.out.println(a + " ist eine Primzahl!");
				} else if (a % i == 0) {
					System.out.println(a + " ist keine Primzahl. Sie ist teilbar durch " + i);
					break;
				} 
			}
		}

	}

}
