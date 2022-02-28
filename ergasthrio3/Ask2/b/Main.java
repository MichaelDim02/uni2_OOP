import java.util.Scanner;

class Main {

    static String str;
    static String anapodo;
    public static void main(String[] args) {

        int i = 0;
        while ( i < 10 ) {
            //εισαγωγή
                   Scanner scan = new Scanner(System.in);
                   System.out.print("εισαγωγή:");
                  str = scan.next();

            //uπολογισμός
            anapodo = reverseString(str);    
            if ( str.equals(anapodo) ) {
                System.out.println("είναι");
            } else {
                System.out.println("δεν είναι");
            }    
            i = i + 1;
        }
    }

    public static String reverseString(String str) {

        if ( str.isEmpty() ) {
            return str;
        }

        return (reverseString(str.substring(1))+str.charAt(0));
    }
}
