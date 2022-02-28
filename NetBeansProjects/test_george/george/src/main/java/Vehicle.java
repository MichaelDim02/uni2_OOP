/**
 *
 * @author george
 */
public abstract class Vehicle {
    private String arithmosKykloforias;
    private Owner idioktitis;
    private int arithmosTheseon;
    
    public Vehicle(String ak, Owner idio, int ath) {
        this.arithmosKykloforias = ak;
        this.idioktitis = idio;
        this.arithmosTheseon = ath;
    }

    //setters
    public void setAk(String ak) {
        this.arithmosKykloforias = ak;
    }
    
    public void setIdioktitis(Owner idio) {
        this.idioktitis = idio;
    }
    
    public void setATh(int ath) {
        this.arithmosTheseon = ath;
    }
    
    //getters
    public String getAk() {
        return this.arithmosKykloforias;
    }
    
    public Owner getIdioktiti() {
        return this.idioktitis;
    }
    
    public int getAth() {
        return this.arithmosTheseon;
    }
    
    //toString
    public String toString(){  
        return arithmosKykloforias + " " + idioktitis + " " + arithmosTheseon;  
    }  

    public void CostGasoline() {
        
    }
}
