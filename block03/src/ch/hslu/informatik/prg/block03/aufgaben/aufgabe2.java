package ch.hslu.informatik.prg.block03.aufgaben;

import java.util.Scanner;

public class aufgabe2 {

	public static void main(String[] args) {
		
		// Deklaration Variablen
		int a; 
		int b; 
		int c; 
		
		// Deklaration Scanner 
		Scanner sc = new Scanner(System.in);
		
		// Einlesen Zahlen
		System.out.print("Bitte erste Zahl einlesen: ");
		a = sc.nextInt();
		
		System.out.print("Bitte zweite Zahl einlesen: ");
		b = sc.nextInt();
		
		System.out.print("Bitte dritte Zahl einlesen: ");
		c = sc.nextInt();
		
		// Sortierung und Output
		if (a > b && a > c) {
			if (b > c) {
				System.out.print("Reheinfolge: " + a + " > " + b + " > " + c);
			} else if (c > b) {
				System.out.print("Reheinfolge: " + a + " > " + c + " > " + b);
			} else {
				System.out.print("Reheinfolge: " + a + " > " + b + " = " + c);
			}
		} else if (b > a && b > c) {
			if (a > c) {
				System.out.print("Reheinfolge: " + b + " > " + a + " > " + c);
			} else if (c > a) {
				System.out.print("Reheinfolge: " + b + " > " + c + " > " + a);
			} else {
				System.out.print("Reheinfolge: " + b + " > " + a + " = " + c);
			}
		} else if (c > a && c > b) {
			if (a > b) {
				System.out.print("Reheinfolge: " + c + " > " + a + " > " + b);
			} else if (b > a) {
				System.out.print("Reheinfolge: " + c + " > " + b + " > " + a);
			} else {
				System.out.print("Reheinfolge: " + c + " > " + a + " = " + b);
			}
		} else {
			if (a == b && a == c) {
				System.out.print("Reheinfolge: " + a + " = " + b + " = " + c);
			} else if (a == b && a > c) {
				System.out.print("Reheinfolge: " + a + " = " + b + " > " + c);
			} else if (a == b && a < c) {
				System.out.print("Reheinfolge: " + c + " > " + b + " = " + a);
			} else if (a == c && a > b) {
				System.out.print("Reheinfolge: " + a + " = " + c + " > " + b);
			} else if (a == c && a < b) {
				System.out.print("Reheinfolge: " + b + " > " + c + " = " + a);
			} else if (b == c && b > a) {
				System.out.print("Reheinfolge: " + b + " = " + c + " > " + a);
			} else if (b== c && b < a) {
				System.out.print("Reheinfolge: " + a + " > " + c + " = " + b);
			}  
		}
	}

}
