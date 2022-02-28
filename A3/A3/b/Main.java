import java.util.Scanner;

/*
 *	Όνομα: Δημόπουλος Μιχαήλ Κωνσταντίνος
 *	ΑΜ: 2020038
 *	Εργαστήριο: 3
 *	Άσκηση: 3 (Υπολογισμός Παλίνδρομου Κειμένου)
 */

class Main {
	static String str, reversed;
	public static void main(String[] args) {
		int num, num_saved;
		for (int i = 0; i<10; i++) {
       			Scanner scan = new Scanner(System.in);

			/* Εισαγωγή και έλεγχος τιμής */
       			System.out.print("Εισαγωγή Κειμένου: ");
      			str = scan.next();

			/* Υπολογισμός */
			reversed = reverseString(str);	

			/* Check */
			if (str.equals(reversed)) {
				System.out.println("Παλίνδρομο");
			} else {
				System.out.println("Μη Παλίνδρομο");
			}	
		}
	}

	public static String reverseString(String str) {
		if (str.isEmpty()) {
			return str;
		}

		return reverseString(str.substring(1)) + str.charAt(0);
	}
}
