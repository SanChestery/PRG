package SW01;

import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Guten Morgen allerseits!");

        int wert = 0;
        System.out.print("Eine ganze Zahl eingeben: ");
        wert = sc.nextInt();

        int quad = wert * wert;

        System.out.print("Quadrat: " + quad);

        sc.close();
    }
}