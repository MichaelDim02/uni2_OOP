
/*
 *      Όνομα: Δημόπουλος Μιχαήλ Κωνσταντίνος
 *      ΑΜ: 2020038
 *      Εργαστήριο: 3
 *      Άσκηση: 2 (Factorial)
 */

class Main {
	 
	public static void  main(String args[]) { 
		/* Αριθμός δίσκων */
		int n = 3;
		hanoi(n, 1, 3, 2);
	} 
	
	static void hanoi(int n, int source, int target, int aux) { 
		if (n == 1) { 
			System.out.println(source + " -> " + target); 
			return; 
		} 
		hanoi(n - 1, source, aux, target); 
		System.out.println(source + " -> " + target); 
		hanoi(n - 1, aux, target, source); 
	} 
}
