
/*
 *      Όνομα: Δημόπουλος Μιχαήλ Κωνσταντίνος
 *      ΑΜ: 2020038
 *      Εργαστήριο: 3
 *      Άσκηση: 4 (Prime numbers 1)
 */

public class Main {
	public static void main(String[] args) {
		int n = 9;
		System.out.println(is_prime(n, n-1));
	}

	public static int is_prime(int n, int m) {
		if (m == 1)
			return 1;
		if (n % m == 0)
			return 0;
		else
			return is_prime(n, m-1);
	}
}
