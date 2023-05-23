package ch.hslu.informatik.prg.block06.twm.twm_aufgabe4;

public class B extends A{
    
    private String message; 

    // Konstruktoren
    public B () {

    }

    public B (int value) {
        super(value);
    } 

    public B (int value, String message) {
        super(value); 
        this.message = message; 
    }
    
    // Methoden
    public void showValue() {
        System.out.print("value = " + this.getValue());
    }

    // Setter 
    public void setMessage(String message) {
        this.message = message;
    }

    // Getter 
    public String getMessage() {
        return message;
    }
}
