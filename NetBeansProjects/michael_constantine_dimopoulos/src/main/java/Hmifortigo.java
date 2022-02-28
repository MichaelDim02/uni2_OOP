/*
 * Ονοματεπώνυμο: Δημόπουλος Μιχαήλ Κωνσταντίνος
 * ΑΜ: 2020038
 * Τμήμα: Τ26
 */

/*
 * @author michael
 */

public class Hmifortigo extends Epivatiko {
    
    public Hmifortigo(int varos, int arithmosKykloforias, int ofelimoFortio) {
        super(varos, arithmosKykloforias, ofelimoFortio);
    }
    public int getVaros(int ofelimoFortio) {
        return (super.getVaros() + super.getOfelimoFortio());
    }
    
    public String toString() {
        return (super.getVaros() + " " + super.getOfelimoFortio() + " " + super.getArithmosKykloforias());
    }
}
