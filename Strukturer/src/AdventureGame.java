import java.util.Scanner;

public class AdventureGame {

	static float h�lsa = 100;
	static int pengar = 10;
	static String f�rnamn = "";
	static String efternamn = "";
	static String spelarnamn = "";
	static int �lder;
	static int str�cka = 0;
	static int posX = 0;
	static int posY = 0;

	static int probability(){ // Returnerar 0-99
		return (int) (Math.random()*100);
	}

	static int probability(int max){ // Returnerae 0-max
		return (int) (Math.random()*max);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

	// Presentera spelet
		System.out.println("Ett �ventyrsspel!");
		System.out.println("Du kommer antagligen att d�..");

	// L�s in spelarens namn och karakt�rsnamn


	//b�rja spelet
		String kommando = "";
		System.out.print("Vad ska vi g�ra? ");
		kommando = in.nextLine();

	// H�ll p� s� l�nge det magiska ordet INTE �r inmatat.
		while (!(kommando.equals("Ni!!") || h�lsa <= 0))
		{

	// H�r ska vi hantera alla olika saker som ska h�nda.

	// Hantering av riktningar
		if(kommando.equalsIgnoreCase("N")){
			System.out.println("Norrut!");
			posY +=1;
			}
		
		if(kommando.equalsIgnoreCase("S")){
			System.out.println("S�derut!");
			posY -=1;
		}
		
		if(kommando.equalsIgnoreCase("�")||
				kommando.equalsIgnoreCase("O")|| 
				kommando.equalsIgnoreCase("E")){
			System.out.println("�sterut!");
			posX +=1;
		}
		
		if(kommando.equalsIgnoreCase("V") || kommando.equalsIgnoreCase("W")){
			System.out.println("V�sterut!");
			posX -=1;
		}

		h�lsa -=0.1;

	// Hantera vad som ska h�nda
		int vadSkaH�nda = probability();


	// Om monster, sannoliokhet 1%
		if (vadSkaH�nda == 0 ){ // Sannolikhet 1% f�r monster

	// Monster
		
		}
		
		else if (vadSkaH�nda <= 10){ // Sannolikhet 10% f�r NPC

	// NPC
		}

		else if(vadSkaH�nda <= 15){ // Sannoikhet 5% f�r pengar

	// Pengar
		}
		else if(vadSkaH�nda <= 18){ // Sannolikhet 3% f�r grop

	// Grop

	// Vi slumpar fram en grop med ett djup
			int djup = probability(5)+1;
			h�lsa -= djup;
			System.out.println("Du trillade ner i en grop och f�rlorade "+djup+" h�lsa!");

		}


		System.out.println("Du �r p� ("+posX+","+posY+") och har h�lsa:"+h�lsa);

		System.out.print("Vad ska vi g�ra? ");
		kommando = in.nextLine();	
		}
		System.out.println("Adj�!");
	}
}