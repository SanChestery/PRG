package ch.hslu.informatik.prg.block02.aufgaben;

public class Aufgabe4 {

	public static void main(String[] args) {
		boolean a = false, b = true, c = true, d = false, v = false;
		int p = 9, q = 10;
		
		//Ausdruck A 
		d = !b; 							// d = false
		System.out.println(d);
		
		//Ausdruck B
		v = !a || b && d || !c && !b; 		// v = true
		System.out.println(v);

		//Ausdruck C
		v = a && b && (p++ < q); 			// v = false p = 9 q = 10
		System.out.println(v + " " + p + " " + q);
		
		//Ausdruck D
		v = a || b && (p++ < q); 			// v = true p = 10 q = 10
		System.out.println(v + " " + p + " " + q);
	}

}
