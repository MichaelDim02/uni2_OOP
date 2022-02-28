
package e99epexergasiadate;

import java.util.Date;
import java.text.*;
import java.util.Scanner;

public class E99epexergasiaDate {

    public static void main(String[] args) {
        
        System.out.println("=== Μετατροπή ημερ/νίας String --> Date ===");
        Date hmerom;
        String hmeromStr;
        
        System.out.print("Δώσε ημερ/νία: ");
        Scanner scan = new Scanner(System.in);
        hmeromStr = scan.nextLine();
        hmerom = convertStrToDate(hmeromStr);
        System.out.println("H μετατροπή της ημερ/νίας σε Date: " + hmerom);
        hmerom = convertStrToDate(hmeromStr);
        
        System.out.println("\n=== Μετατροπή ημερ/νίας Date --> String ===");
        hmeromStr = convertDateToStr(hmerom);
        System.out.println("H μετατροπή της ημερ/νίας σε String: " + hmeromStr);
        
    }

    private static Date convertStrToDate(String hmeromStr) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date hmerom = null;
        try {
            hmerom = df.parse(hmeromStr);
        }
        catch (Exception ex ){
            System.out.println(ex);
        }
        return hmerom;
    }
        
    private static String convertDateToStr(Date hmerom) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String str = df.format(hmerom);
        return str;
    }

}
