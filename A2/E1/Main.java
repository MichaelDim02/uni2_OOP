
/*
 *	Όνομα: Δημόπουλος Μιχαήλ-Κωνσταντίνος
 *	ΑΜ: 2020038
 *	Εργασία: 2η
 *	Άσκηση: 1η
 */

public class Main{
	public static void main(String[] args) {
		/* a */
		String text = "Περιφέρεια Κεντρικής Μακεδονίας";

		/* b */
		System.out.println(text.length());

		/* c */
		for (int i=0; i<text.length(); i++) {
			System.out.print(text.charAt(i)+" ");
		}

		/* d */
		for (int i=0; i<text.length(); i++) {
			System.out.println(text.charAt(i));
		}

		/* e */
		char[] textChar = text.toCharArray(); 
		for (int i=0; i<textChar.length; i++) {
			System.out.print(textChar[i]+"|");
		}

		/* f */
		String[] split = text.split("\\s+");

		for (int i=0; i<split.length; i++) {
			System.out.println(split[i]);
		}	
		for (int i=0; i<split.length; i++) {
			System.out.print(split[i]);
		}	
		System.out.println("");

		/* g */
		String arktikolexo = text.substring(0,2)+"."+text.substring(11,13)+"."+text.substring(21,23)+".";
		System.out.println(arktikolexo);

		/* h */
		text = text.replaceAll("Κεντρικής", "Δυτικής");		
		System.out.println(text);

		/* f */
		if (text.contains("ικής")) {
			System.out.println("String contains ικής");
		}
	}
}
