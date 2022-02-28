import java.util.Scanner;

/*
 *	Όνομα: Δημόπουλος Μιχαήλ Κωνσταντίνος
 *	ΑΜ: 2020038
 *	Εργαστήριο: 3
 *	Άσκηση: 3 (Υπολογισμός Παλίνδρομου Αριθμού)
 */

class Main {
	public static void main(String[] args) {
	  
		int num, num_saved;
		for (int i = 0; i<10; i++) {
       			Scanner scan = new Scanner(System.in);

			/* Εισαγωγή και έλεγχος τιμής */
			do {
       				System.out.print("Εισαγωγή αριθμού: ");
      				num = scan.nextInt();
				num_saved = num;

			} while (num < 0 || num > 100000);
			

			int reversed = 0;

			/* Υπολογισμός */
			while(num != 0) {
				int digit = num % 10;
				reversed = reversed * 10 + digit;
				num = num / 10;
			}
			
			/* Check */
			if (reversed == num_saved) {
				System.out.println("Παλίνδρομος");
			} else {
				System.out.println("Μη Παλίνδρομος");
			}	
		}
	}
}
