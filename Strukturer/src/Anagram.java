import java.util.ArrayList;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		// Skriv ut lite text och be anv�ndaren skriva in en str�ng.

		String str = new String();
		Scanner in = new Scanner(System.in);		
		System.out.print("Skriv en str�ng: ");
		str = in.nextLine();
		in.close();
		// H�r skapar vi en lista av str�ngen. Detta �r f�r att kunna slumpvis v�lja fram ett tecken.
		ArrayList<Character> chars = new ArrayList<Character>();
			for (char c : str.toCharArray()) {
				chars.add(c);
			}
//			for (int x=0;x< chars.size();x++)
//				System.out.println(x+": "+chars.get(x));

			String newString = new String();
			while (!chars.isEmpty()) {
				int i=(int) (Math.random()*chars.size());
				newString += Character.toString(chars.get(i));
				chars.remove(i);
		}
			
			System.out.println("Anagram: "+newString);
	}
}