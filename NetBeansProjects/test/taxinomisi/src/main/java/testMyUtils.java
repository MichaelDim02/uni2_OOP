
public class testMyUtils {
    public static void main(String[] args) {
        Foititis foitlist[] = new Foititis[7];
        
        for (int i = 0; i < foitlist.length; i++) {
            System.out.println("Όνομα: ");
            String name = UserInput.getString();
            System.out.println("Επώνυμο");
            String epwn = UserInput.getString();
            foitlist[i] = new Foititis(name, epwn);
            System.out.println("ΑΜ: ");
            Short AM = UserInput.getShort();
            System.out.println("Έτος εισαγωγής: ");
            Short Yr = UserInput.getShort();
            foitlist[i].setAM(AM);
            foitlist[i].setYear(Yr);
        }

        // Αναζηση
        System.out.println("Insertion sort (AM) -----------------------");
        MyUtils.insertSortAM(foitlist);
        for (Foititis fit : foitlist) {
            fit.info();
        }
        System.out.println("Buble sort (EE) ---------------------");
        MyUtils.bubbleSortEE(foitlist);
        for (Foititis fit : foitlist) {
            fit.info();
        }
        System.out.println("Selection sort (Epwn) ---------------------");
        MyUtils.selectSortEpwnymo(foitlist);
        for (Foititis fit : foitlist) {
            fit.info();
        }
    }
}
