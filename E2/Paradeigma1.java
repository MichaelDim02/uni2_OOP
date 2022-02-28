
public class Paradeigma1 {
    
    public static void main(String args[]) {
         
        // Παράδειγμα πινάκων: String
        String[] thisIsAStringArray = {"Πέστροφα", "Σολομός", "Σκουμπρί"};
        // Μετά την δήλωση του πεδίου αναφοράς
        thisIsAStringArray = new String[] {"Αχλάδι", "Πορτοκάλι", "Πεπόνι"};
        System.out.println( thisIsAStringArray[0] );
        System.out.println( thisIsAStringArray[1] );
        System.out.println( thisIsAStringArray[2] );
        
        // Δομή for -  1ος τρόπος
        for( int i = 0; i < thisIsAStringArray.length; i++) {          
            System.out.println( thisIsAStringArray[i]);    
        }
        // Δομή for -  2ος τρόπος
        for (String element : thisIsAStringArray) {
            System.out.print( element + " ,  ");  
        }
        
        // αναζήτηση String
        String stringToSearch = "Σολομός";
        boolean found = false;
        for (String element:thisIsAStringArray) {
            if ( element.equals( stringToSearch )) {
                found = true;
            }
        }
        if (found) 
            System.out.println( "\nThe array contains the string: " + stringToSearch );
        else 
            System.out.println( "\nThe array does not contains the string: " + stringToSearch );        
    
        
    // Ελεγγος περιττών/άρτιων αριθμών
     int a = 5;
     if (( a % 2 ) != 0)
        System.out.println("Είναι περιττός αριθμός " + a);        
    }
    
}
