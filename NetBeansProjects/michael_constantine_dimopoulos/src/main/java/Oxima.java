/*
 * Ονοματεπώνυμο: Δημόπουλος Μιχαήλ Κωνσταντίνος
 * ΑΜ: 2020038
 * Τμήμα: Τ26
 */

/*
 * @author michael
 */

public class Oxima {
    private int varos;
    private int arithmosKykloforias;
    private Tachymetro tachymetro;

    public Oxima(int varos, int arithmosKykloforias) {
        this.varos = varos;
        this.arithmosKykloforias = arithmosKykloforias;
    }
    
    public int setVaros(int varos) {
        return this.varos = varos;
    }
        
    public int getVaros() {
        return this.varos;
    }
    
    public int getArithmosKykloforias() {
        return this.arithmosKykloforias;
    }
    
    public void addTachymetro(Tachymetro tachymetro) {
        this.tachymetro = tachymetro;
    }
    
    public void seKinisi() {
        
    }
            
    @Override
    public String toString() {
        return " " + varos + " ";
    }
}
