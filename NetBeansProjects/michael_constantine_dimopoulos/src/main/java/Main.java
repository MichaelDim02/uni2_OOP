/*
 * Ονοματεπώνυμο: Δημόπουλος Μιχαήλ Κωνσταντίνος
 * ΑΜ: 2020038
 * Τμήμα: Τ26
 *
 * Δεν μπόρεσα να ανοίξω το κώδικα που στείλατε οπότε το
 * έκανα κάπως στα τυφλά. Ελπίζω να μην παίζει πολύ ρόλο.
 */

/*
 * @author michael
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hmifortigo[] pinOximata = new Hmifortigo[5];
        Hmifortigo[] animals={new Hmifortigo(), new Oximo(), new Epivatiko()}; 
        
        pinOximata[0] = new Hmifortigo(500, 20201, 0);
        pinOximata[1] = new Hmifortigo(600, 20202, 0);
        pinOximata[2] = new Hmifortigo(700, 20203, 0);
        pinOximata[3] = new Hmifortigo(800, 20204, 0);
        pinOximata[4] = new Hmifortigo(1000, 20205, 0);
        
        try {
            pinOximata[0].setOfelimoFortio(10);
            pinOximata[1].setOfelimoFortio(20);
            pinOximata[2].setOfelimoFortio(40);
            pinOximata[3].setOfelimoFortio(30);
            pinOximata[4].setOfelimoFortio(60);
        } catch(Exception e) {
            System.out.println("Must be an integer");
            System.exit(0);
        }
        
        for (int i = 0; i < pinOximata.length; i++) {
            System.out.println(pinOximata[i].toString());
        }
        
        Tachymetro tachym1 = new Tachymetro();
        Tachymetro tachym2 = new Tachymetro();
        
        pinOximata[0].addTachymetro(tachym1);
        pinOximata[1].addTachymetro(tachym2);
        pinOximata[2].addTachymetro(tachym2);
        pinOximata[3].addTachymetro(tachym1);
        pinOximata[4].addTachymetro(tachym2);
    }
}
