
/**
 *
 * @author george
 */
public class Gasoline extends Vehicle {
    private int kyvikaEkatosta;
    private int reservoirXwros;
    private double mesiKatanalwsi;
    
    public Gasoline(String ak, Owner idio, int ath, int kyvikaEkatosta, int reservoirXwros, double mesiKatanalwsi) {
        super(ak, idio, ath);
        this.kyvikaEkatosta = kyvikaEkatosta;
        this.reservoirXwros = reservoirXwros;
        this.mesiKatanalwsi = mesiKatanalwsi;
    }
    
    //setters
    public void setKyvikaEkatosta(int kyvikaEkatosta) {
        this.kyvikaEkatosta = kyvikaEkatosta;
    }
    
    public void setReservoirXwros(int reservoirXwros) {
        this.reservoirXwros = reservoirXwros;
    }
    
    public void setMesiKatanalwsi(int mesiKatanalwsi) {
        this.mesiKatanalwsi = mesiKatanalwsi;
    }
    
    //getters
    public int getKyvikaEkatosta() {
        return this.kyvikaEkatosta;
    }
 
    public int getReservoirXwros() {
        return reservoirXwros;
    }
    
    public double getMesiKatanalwsi() {
        return mesiKatanalwsi;
    }
    
    //toString
    public String toString(){  
        return kyvikaEkatosta + " " + reservoirXwros + " " + mesiKatanalwsi;  
    }
    
    public void costGasoline() {
        double autonomia = 100 * (reservoirXwros / mesiKatanalwsi);
    }
}
