import java.util.Scanner;

public class testMyUtils {
    public static void main(String[] args) {
        Foititis foitlist[] = new Foititis[10];
        
        foitlist[0] = new Foititis("Giannis", "Poulopoulos", (short)1010, (short)2012);
        foitlist[1] = new Foititis("Giorgos", "Moulopoulos", (short)1011, (short)2012);
        foitlist[2] = new Foititis("Giannis", "Koulopoulos", (short)1012, (short)2012);
        foitlist[3] = new Foititis("Petros", "Voulopoulos", (short)1013, (short)2012);
        foitlist[4] = new Foititis("Dimos", "Loulopoulos", (short)1014, (short)2012);
        foitlist[5] = new Foititis("Giannis", "Soulopoulos", (short)1015, (short)2012);
        foitlist[6] = new Foititis("Akis", "Xoulopoulos", (short)1016, (short)2012);
        foitlist[7] = new Foititis("Giorgos", "Zoulopoulos", (short)1017, (short)2012);
        foitlist[8] = new Foititis("Giorgos", "Houlopoulos", (short)1018, (short)2012);
        foitlist[9] = new Foititis("Giannis", "Goulopoulos", (short)1019, (short)2012);
        
        System.out.println("Επώνυμο: ");
        Scanner scanner = new Scanner(System.in);
        String epwn = scanner.nextLine();
        int pos = MyUtils.anazitisiMeEpwnymo(foitlist, epwn);
        if (pos == -1) {
            System.out.println("Not found,");
        } else {
            foitlist[pos].info();
        }

        System.out.println("Αναζήτηση ΑΜ (binary search)");
        System.out.println("AM: ");
        int am = Integer.parseInt(scanner.nextLine());
        int pos0 = MyUtils.anazitisiMeArMitrwou(foitlist, (short)am);
        if (pos0 == -1) {
            System.out.println("Not found,");
        } else {
            foitlist[pos0].info();
        }

        System.out.println("Αναζήτηση ΑΜ (recursive binary search)");
        System.out.println("AM: ");
        am = Integer.parseInt(scanner.nextLine());
        int pos1 = MyUtils.anadromiAnazMeArithMitrwou(foitlist, (short)am, 0, foitlist.length -1);
        if (pos1 == -1) {
            System.out.println("Not found,");
        } else {
            foitlist[pos1].info();
        }
    }
}
