
/*
 *      Όνομα: Δημόπουλος Μιχαήλ Κωνσταντίνος
 *      ΑΜ: 2020038
 *      Εργαστήριο: 3
 *      Άσκηση: 4 (Prime numbers 2, 1-1000)
 */

public class Main {
	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			if (is_prime(i, i-1) == 1) {
				System.out.println(i);
			}
	}
}

	public static int is_prime(int n, int m) {
		if (n == 1)
			return 1;
		if (m == 1)
			return 1;
		if (n % m == 0)
			return 0;
		else
			return is_prime(n, m-1);
	}
}
