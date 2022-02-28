/**
 * Όνομα: Κώστας
 * Επίθετο: Κορδέλλος
 * ΑΜ: 2020071
 * @author kostas
 */
public abstract class Employee {
    private String name;
    private int AM;
    private Job job;
    
    public Employee(String name, int AM, Job job) {
        this.name = name;
        this.AM = AM;
        this.job = job;
    }
    
    // ---- SETTERS ----
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAM(int AM) {
        this.AM = AM;
    }
    
    public void setJob(Job job) {
        this.job = job;
    }
    
    // ---- GETTERS ----
    public String getName() {
        return this.name;
    }
    
    public int getAM() {
        return this.AM;
    }
    
    public Job getJob() {
        return this.job;
    }
    
    public String toString(){  
        return name + " " + AM + " " + job;  
    }
    
    public abstract int salary();
}
