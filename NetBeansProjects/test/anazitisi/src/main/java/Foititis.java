public class Foititis {
    private String onoma;
    private String epwnymo;
    private short AM;
    private short year;

    public Foititis(String onoma, String epwnymo, short AM, short year) {
        this.onoma = onoma;
        this.epwnymo = epwnymo;
        this.AM = AM;
        this.year = year;
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
    
    public short getAM() {
        return this.AM;
    }
}
