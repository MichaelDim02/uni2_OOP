/*
 * 	Όνομα: Δημόπουλος Μιχαήλ-Κωνσταντίνος
 * 	ΑΜ: 2020038
 * 	Εργασία: 2η
 * 	Άσκηση: 2η
 */

public class Main{
	public static void main(String[] args) {
		/* a *************************/
		int[] P = {10,90,35,23,86};
		int plen = P.length;

		/* b *************************/
		for (int i: P) {
			System.out.print(i+" ");
		}
		System.out.println("");

		for (int i=0; i<plen; i++) {
			System.out.print(P[i]+" ");
		}
		System.out.println("");

		/* c *************************/
		for (int i: P) {
			if (i % 2 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("");

		/* d *************************/
		System.out.println("Len: "+plen);

		/* e *************************/
		int sum = 0;	
		for (int i: P) {
			sum = sum + i;
		}
		System.out.println("Sum: "+sum);

		/* f *************************/
		int max = P[0];	
		for (int i: P) {
			if (i > max) {
				max = i;
			}	
		}
		System.out.println("Max: "+max);

		
		int min = P[0];	
		for (int i: P) {
			if (i < min) {
				max = i;
			}	
		}
		System.out.println("Min: "+min);
	}
}
