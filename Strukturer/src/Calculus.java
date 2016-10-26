// Zozk Mohamed
import java.util.Scanner;

class Calculus {

	public static void main(String[] args) {
		Scanner min = new Scanner(System.in); 
		double fnum, snum, answer;
		System.out.println("Välj ditt första nummer: ");
		fnum = min.nextDouble();
		System.out.println("Välj ditt andra numer: ");
		snum = min.nextDouble();
		answer = fnum + snum; 
		System.out.println(answer); 
	}

}
