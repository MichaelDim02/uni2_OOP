/**
 * Όνομα: Κώστας
 * Επίθετο: Κορδέλλος
 * ΑΜ: 2020071
 * @author kostas
 */

public class Misthotos extends Employee {
    private int basicSal;
    private int domites;
    
    public Misthotos(String name, int AM, Job job, int basicSal, int domites) {
        super(name, AM, job);
        this.basicSal = basicSal;
        this.domites = domites;
    }
    
    // ---- SETTERS ----
    public void setBasicSal(int basicSal) {
        this.basicSal = basicSal;
    }
    
    public void setDomites(int domites) {
        this.domites = domites;
    }
    
    // ---- GETTERS ----
    public int getBasicSal() {
        return this.basicSal;
    }
    
    public int getDomites() {
        return this.domites;
    }
    
    public String toString(){  
        return basicSal + " " + domites;  
    }
    
    public int salary(int bonus) {
        return (this.basicSal + bonus);
    }
}
