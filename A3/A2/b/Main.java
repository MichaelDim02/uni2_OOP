
/*
 *      Όνομα: Δημόπουλος Μιχαήλ Κωνσταντίνος
 *      ΑΜ: 2020038
 *      Εργαστήριο: 3
 *      Άσκηση: 2 (Fibonacci)
 */

public class Main {
	public static void main(String[] args) {
		int n = 1;
		System.out.println(n);
		fibonacci(0, n);
	}

	public static int fibonacci(int n1, int n2) {
		if (n2 == 144) {
			System.out.println("Done.");
			return -1;
		} else {
			int n3 = n1 + n2;
			System.out.println(n3);
			int n4 = fibonacci(n2, n3);	
			return n4;
		}
	}
}
