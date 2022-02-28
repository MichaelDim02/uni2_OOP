import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      
        int num;

        int num2;
        int i = 0;
        while ( i < 10 ) {
                   Scanner scan = new Scanner(System.in);

            //Εισαγωγή
            do {
                       System.out.print("δώσε αριθμο:");
                      num = scan.nextInt();
                num2 = num;
            //έλεγχος
            } while ( num < 0 || num >= 10000 );
            
            int anapodo = 0;

            //υπολογισμός
            while( num != 0 ) {

                int digit = num % 10;
                anapodo = anapodo * 10 + digit;
                num = num / 10;
            }
            if ( anapodo == num2 ) {
                System.out.println("είναι");
            } else {
                System.out.println("δεν είναι");
            }    

            i = i + 1;
        }
    }
}
