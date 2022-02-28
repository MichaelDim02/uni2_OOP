/*
 * Ονοματεπώνυμο: Δημόπουλος Μιχαήλ Κωνσταντίνος
 * ΑΜ: 2020038
 * Τμήμα: Τ26
 */

/*
 * @author michael
 */

public class Epivatiko extends Oxima {
    private int ofelimoFortio;
    
    public Epivatiko(int varos, int arithmosKykloforias, int ofelimoFortio) {
        super(varos, arithmosKykloforias);
        this.ofelimoFortio = ofelimoFortio;
    }
    public void setOfelimoFortio(int ofelimoFortio) {
        this.ofelimoFortio = ofelimoFortio;
    }
    
    public int getOfelimoFortio() {
        return this.ofelimoFortio;
    }
    
    public int getVaros() {
        return super.getVaros();
    }
    
    public int getArithmosKykloforias() {
        return super.getArithmosKykloforias();
    }
}
