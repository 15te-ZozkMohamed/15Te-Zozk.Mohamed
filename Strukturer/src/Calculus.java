// Zozk Mohamed
import java.util.Scanner;

class Calculus {

	public static void main(String[] args) {
		Scanner min = new Scanner(System.in); 
		double fnum, snum, answer;
		System.out.println("V�lj ditt f�rsta nummer: ");
		fnum = min.nextDouble();
		System.out.println("V�lj ditt andra numer: ");
		snum = min.nextDouble();
		answer = fnum + snum; 
		System.out.println(answer); 
	}

}
