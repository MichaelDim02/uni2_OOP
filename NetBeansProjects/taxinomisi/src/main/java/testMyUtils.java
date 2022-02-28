
public class testMyUtils {
    public static void main(String[] args) {
        Foititis foitlist[] = new Foititis[7];
        
        foitlist[0] = new Foititis("Petros", "Petropoulos");
        foitlist[1] = new Foititis("Dimos", "Dimakis");
        foitlist[2] = new Foititis("Loudis", "Louloudis");
        foitlist[3] = new Foititis("Zaxaro", "Zaxarako");
        foitlist[4] = new Foititis("Giorgos", "Giorgou");
        foitlist[5] = new Foititis("Gannis", "Giannidis");
        foitlist[6] = new Foititis("Akis", "Koutrakis");
        
        for (int i = 0; i < foitlist.length; i++) {
            System.out.println("ΑΜ: ");
            Short AM = UserInput.getShort();
            System.out.println("Έτος εισαγωγής: ");
            Short Yr = UserInput.getShort();
            foitlist[i].setAM(AM);
            foitlist[i].setYear(Yr);
        }

        System.out.println("Quick sort (AM)==============================");
        MyUtils.quickSortAM(foitlist, 0, foitlist.length-1);
        for (Foititis fit: foitlist) {
            fit.info();
        }
    }
}
