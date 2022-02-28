
/**
 *
 * @author george
 * Γεώργιος Γρηγορίου
 * 2020035
 */
public class Owner {
    private String name;
    private String AM;
    
    public Owner(String name, String am) {
        this.name = name;
        this.AM = am;
    }
    
    //setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAM(String am) {
        this.AM = am;
    }
    
    //getters
    public String getName() {
        return this.name;
    }
    
    public String getAM() {
        return this.AM;
    }
    
    //toString
    public String toString(){  
        return name + " " + AM;  
    }
}
