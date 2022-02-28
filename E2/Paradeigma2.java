public class Paradeigma2 {

     public static void main(String args[]) {
         
        // Ασκηση 1
        String strDPE = "Διεθνές Πανεπιστήμιο Της Ελλάδος";
        System.out.println("\n***Μήκος συμβολοσειράς: " + strDPE.length());
        System.out.println("\n*** Παράδειγμα με charAt");
        for (int i=0; i<strDPE.length(); i++)
            System.out.print(strDPE.charAt(i));
                
        // Μεταφορά σε πίνακα char : toCharArray
        System.out.println("\n*** Μεταφορά σε πίνακα char : toCharArray");
        char[] chars = strDPE.toCharArray();
        for (int i=0; i<strDPE.length(); i++)
            System.out.println(chars[i]);  // + " ");
        // Εναλλακτικός τρόπος
        for (char c : chars) {
            System.out.print(c + " ");
        }
        
        // Διαχωρισμός λέξεων συμβολοσειράς : split
        System.out.println("\n***Διαχωρισμός λέξεων συμβολοσειράς");
        String[] arrOfStr = strDPE.split(" ");
        for (String lexi: arrOfStr)
            System.out.println(lexi);
        
        // Συμβολοσειρά από συνένωση λέξεων : substring
        System.out.println("\n***Συμβολοσειρά από συνένωση λέξεων");
        // substring(int firstIndex, int lastIndex)
        String arktikolexo="";        
        for (String lexi: arrOfStr)
            arktikolexo += lexi.substring(0, 2) + ".";
        System.out.println(arktikolexo);
        
        // Δυναμική συμβολοσειρά : StringBuffer
        System.out.println("\n***Δυναμική συμβολοσειρά : StringBuffer");
        StringBuffer strBuf = new StringBuffer("");
        strBuf.append(arrOfStr[0] + " ");
        System.out.println(strBuf);
        strBuf.append(arrOfStr[1] + " ");
        System.out.println(strBuf);
        strBuf.append(arrOfStr[3]);
        System.out.println(strBuf);
               
        // Συμβολοσειρά από ανταλλαγή λέξεων : Stringbuffer
        System.out.println("\n***Συμβολοσειρά από ανταλλαγή λέξεων");
        System.out.println(strBuf);
        String temp, tempUpper = "";
        int arxi = 0;                
        int indexOfKeno = strBuf.indexOf(" ");       
        System.out.println(strBuf.substring(arxi, indexOfKeno));
        temp = strBuf.substring(arxi, indexOfKeno);
        tempUpper = temp.toUpperCase();
        strBuf.replace(arxi, indexOfKeno, tempUpper);
        System.out.println(strBuf);
    }
 
}
