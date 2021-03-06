import java.util.Scanner;

	public class Krypto {

		static int sizeX, sizeY;

		@SuppressWarnings("resource")
		public static void main(String[] args) {
			
			System.out.println("Skriv in storleken p� ditt korsord!");
			
			// L�s in antal rader i kryptot
			System.out.print("Antal rader: ");
			Scanner in = new Scanner(System.in);	
			sizeY = in.nextInt();
			System.out.print("Antal kolumner: ");
			sizeX = in.nextInt();
		
			// Skapa korsordet
			int[][] korsord = new int[sizeX][sizeY];
			
			// Stoppa in siffror i korsordet:
			System.out.println("Skriv in en rad med siffror, avsluta med ENTER");
			for (int y=0; y < sizeY; y++){
				for (int x=0; x < sizeX; x++){
					System.out.print("Skriv in siffra p� rad "+y+": "+"plats "+x+": ");
					korsord[x][y] = in.nextInt();
				}
			}
			
			// Skriv ut korsordet
			System.out.println("Korsordet ser ut s� h�r:");
			
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < sizeX; i++) {
				sb.append("---");
			}
			
			sb.append('-');
			
			String line = sb.toString();
			System.out.println(line);
			
			for(int y=0; y < sizeY; y++){
				System.out.print("|");
				for(int x=0; x < sizeX; x++){
					String formatting = "%2d|";
					System.out.printf(formatting, korsord[x][y]);
				}
				
				System.out.println();
				System.out.println(line);
			}
		}
	}

