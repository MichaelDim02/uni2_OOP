public class Foititis {
    private String onoma;
    private String epwnymo;
    private short AM;
    private short year;

    public Foititis(String onoma, String epwnymo) {
        this.onoma = onoma;
        this.epwnymo = epwnymo;
    }
    
    public void info() {
        System.out.println("Όνομα: " + this.onoma);
        System.out.println("Επώνυμο: " + this.epwnymo);
        System.out.println("AM: " + this.AM);
        System.out.println("Έτος εισαγωγής: " + this.year);
    }
    
    public String getEpwn() {
        return this.epwnymo;
    }
    
    public void setEpwn(String epwn) {
        this.epwnymo = epwn;
    }

    public String getName() {
        return this.onoma;
    }
    
    public void setName(String name) {
        this.onoma = name;
    }
    
    public short getAM() {
        return this.AM;
    }
    
    public void setAM(short am) {
        this.AM = am;
    }
    
    public short getYear() {
        return this.year;
    }
    
    public void setYear(short year) {
        this.year = year;
    }
}
