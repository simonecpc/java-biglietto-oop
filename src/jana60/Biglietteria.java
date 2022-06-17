package jana60;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int etaPasseggero;
		System.out.println("Inserire età:");
		etaPasseggero = scan.nextInt();
		
		double km;
		System.out.println("Inserire distanza in km:");
		km = scan.nextDouble();
		
		Biglietto b = new Biglietto(etaPasseggero, km);
		
		System.out.println("Il prezzo finale è: " + b.calcolo());
	}
	
}
