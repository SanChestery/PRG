package ch.hslu.informatik.prg.block02.aufgaben;

public class Aufgabe3 {

	public static void main(String[] args) {

		int x = 10, y = 20, z = 30;
		//Ausgabe 20
		System.out.println("y: " + y++);
		//Ausgabe 29
		System.out.println("z: " + --z);
		
		int p = x-- + y-- + --z;
		//Ausgabe 59
		System.out.println("p: " + p);
		
		x = 10; 
		y = 133; 
		//Ausgabe 10
		System.out.println(x + "%" + y + " = " + x % y);
		//Ausgabe 3
		System.out.println(y + "%" + x + " = " + y % x);
		
		int a = 3, b = 8, c = 12, res = 4;
		res += a * b; 
		//Ausgabe 28
		System.out.println("res: " + res);

	}

}
