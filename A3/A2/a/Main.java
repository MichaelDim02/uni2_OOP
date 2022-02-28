
/*
 *      Όνομα: Δημόπουλος Μιχαήλ Κωνσταντίνος
 *      ΑΜ: 2020038
 *      Εργαστήριο: 3
 *      Άσκηση: 2 (Factorial)
 */

public class Main {
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	public static int factorial(int n) {
		if (n < 0) {
			System.out.println("Cannot compute factorial of a negative number.");
			return -1;
		}
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
}
