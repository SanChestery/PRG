package ch.hslu.informatik.prg.block06.twm.twm_aufgabe4;

public class MainClass {
    public static void main(String[] args) {
        
        // Klasseninstanzierung
        A instanz1 = new A(10); 
        B instanz2 = new B(12); 

        A instanz3 = new A(14); 
        B instanz4 = new B(16);

        A instanz5 = new A(50); 
        B instanz6 = new B(50); 

        B instanz7 = new B(18, "Hello World"); 
        
        // Zustandsveränderung
        instanz1.setValue(10);
        instanz2.setValue(12); 
        
        // Ausgabe 
        System.out.println("Ausgabe = " + instanz1.getValue()); 
        instanz2.showValue();

        System.out.println("\nAusgabe = " + instanz3.getValue()); 
        instanz4.showValue();

        System.out.println("\nAusgabe = " + instanz5.getValue()); 
        instanz6.showValue();

        System.out.println("\nAusgabe: Value = " + instanz7.getValue()+ "\tMessage = " + instanz7.getMessage()); 
    }
}
