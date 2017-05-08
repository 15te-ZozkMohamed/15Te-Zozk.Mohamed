import java.util.Scanner;

public class AdventureGame {

	static float hälsa = 100;
	static int pengar = 10;
	static String förnamn = "";
	static String efternamn = "";
	static String spelarnamn = "";
	static int ålder;
	static int sträcka = 0;
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
		System.out.println("Ett äventyrsspel!");
		System.out.println("Du kommer antagligen att dö..");

	// Läs in spelarens namn och karaktärsnamn


	//börja spelet
		String kommando = "";
		System.out.print("Vad ska vi göra? ");
		kommando = in.nextLine();

	// Håll på så länge det magiska ordet INTE är inmatat.
		while (!(kommando.equals("Ni!!") || hälsa <= 0))
		{

	// Här ska vi hantera alla olika saker som ska hända.

	// Hantering av riktningar
		if(kommando.equalsIgnoreCase("N")){
			System.out.println("Norrut!");
			posY +=1;
			}
		
		if(kommando.equalsIgnoreCase("S")){
			System.out.println("Söderut!");
			posY -=1;
		}
		
		if(kommando.equalsIgnoreCase("Ö")||
				kommando.equalsIgnoreCase("O")|| 
				kommando.equalsIgnoreCase("E")){
			System.out.println("Österut!");
			posX +=1;
		}
		
		if(kommando.equalsIgnoreCase("V") || kommando.equalsIgnoreCase("W")){
			System.out.println("Västerut!");
			posX -=1;
		}

		hälsa -=0.1;

	// Hantera vad som ska hända
		int vadSkaHända = probability();


	// Om monster, sannoliokhet 1%
		if (vadSkaHända == 0 ){ // Sannolikhet 1% för monster

	// Monster
		
		}
		
		else if (vadSkaHända <= 10){ // Sannolikhet 10% för NPC

	// NPC
		}

		else if(vadSkaHända <= 15){ // Sannoikhet 5% för pengar

	// Pengar
		}
		else if(vadSkaHända <= 18){ // Sannolikhet 3% för grop

	// Grop

	// Vi slumpar fram en grop med ett djup
			int djup = probability(5)+1;
			hälsa -= djup;
			System.out.println("Du trillade ner i en grop och förlorade "+djup+" hälsa!");

		}


		System.out.println("Du är på ("+posX+","+posY+") och har hälsa:"+hälsa);

		System.out.print("Vad ska vi göra? ");
		kommando = in.nextLine();	
		}
		System.out.println("Adjö!");
	}
}