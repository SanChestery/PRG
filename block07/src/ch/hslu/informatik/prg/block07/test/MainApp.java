package ch.hslu.informatik.prg.block07.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;

import ch.hslu.prg.block07.container.SimpleGenericList;
import ch.hslu.prg.block07.domain.Adresse;

public class MainApp {

    public static void printAdressListe(SimpleGenericList<Adresse> obj) {
        // Ausgabe Size der Objekte
        
        System.out.println("Total sind " + obj.getSize() + " Elemente gespeichert");
        for (int i = 0; i < obj.getSize(); i++) {
            System.out.println("Nr. " + (i + 1) + " ist " + obj.get(i).getAddr()); 
        }
    }

    public static void main(String[] args) {
        SimpleGenericList adressListe = new SimpleGenericList<>(3); 
        Adresse add1 = new Adresse("str1"); 
        Adresse add2 = new Adresse("str2");
        Adresse add3 = new Adresse("str3");

        adressListe.add(add1);
        adressListe.add(add2);
        adressListe.add(add3); 

        printAdressListe(adressListe);

        Adresse add4 = new Adresse("str4"); 
        if (adressListe.add(add4)) {
            System.out.println("Einfügen hat funktioniert!"); 
        } else {
            System.out.println("Einfügen hat NICHT funktioniert!");
        }

        printAdressListe(adressListe);

        if(adressListe.remove(1)) 
            System.out.println("Entfernen hat funktioniert!");
        
        printAdressListe(adressListe);

        if(adressListe.remove(10)) {
            System.out.println("Enfernen hat funktioniert!");
        } else {
            System.out.println("Entfernen hat NICHT funktioniert!");
        }

        SimpleGenericList datumListe = new SimpleGenericList<>(3);
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2023, Month.AUGUST, 18);
        
        datumListe.add(date1); 
        datumListe.add(date2);

        for (int i = 0; i < 2; i++) {
            System.out.println("Datum Liste eintrag " + (i + 1) + " ist " + datumListe.get(i));
        }
        
        Adresse addr5 = new Adresse("str5"); 
        datumListe.add(addr5);

        for (int i = 0; i < 3; i++) {
            System.out.println("Datum Liste eintrag " + (i + 1) + " ist " + datumListe.get(i));
        }

        // Die letzten beiden funktionieren nicht, da sie einen Typcasting error hervorrufen. 

        adressListe.add(date1); 
        printAdressListe(adressListe);
    }
}
