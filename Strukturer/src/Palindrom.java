import java.util.Scanner;

public class Palindrom {

		public static void main(String[] args) {
			String mening = new String();
			int antaltecken; 
			
			System.out.print("Skriv in en mening:");
			Scanner tangetntbord = new Scanner(System.in);
			
			mening= tangetntbord.nextLine();
			
			antaltecken = mening.length();
			System.out.println("Meningen är " +antaltecken+" tecken lång.");
			tangetntbord.close();
			
			//Vi vänder på meningen och skriver ut den.
			for(int plats = antaltecken-1; plats > -1; plats--)
			{
			System.out.print(mening.charAt(plats));		
			}
			System.out.println();
			String reversed = new StringBuilder(mening).reverse().toString();
			
			reversed = reversed.replaceAll(" "," ");			
			mening = mening.replaceAll(" "," ");
			System.out.println("Baklänges:"+reversed);
			
			if(mening.replaceAll(" "," ").equalsIgnoreCase(reversed.replaceAll(" ",""))){
				System.out.println("Ett palindrom!");
		}	
	}
}
