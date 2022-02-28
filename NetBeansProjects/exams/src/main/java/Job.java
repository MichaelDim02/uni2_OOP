/**
 * Όνομα: Κώστας
 * Επίθετο: Κορδέλλος
 * ΑΜ: 2020071
 * @author kostas
 */

public class Job {
    private int code;
    private int bonus;
    
    public Job(int code, int bonus) {
        this.code = code;
        this.bonus = bonus;
    }
     
    // ---- SETTERS ----
    public void setName(int code) {
        this.code = code;
    }
    
    public void setAM(int bonus) {
        this.bonus = bonus;
    }
    
    // ---- GETTERS ----
    public int getBonus() {
        return this.bonus;
    }
    
    public int getCode() {
        return this.code;
    }
    
    public String toString(){  
        return code + " " + bonus;  
    }
    
}
