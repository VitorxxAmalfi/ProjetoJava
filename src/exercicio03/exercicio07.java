package exercicio03;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("De o valor do raio:");
		float raio=sc.nextFloat();
		
		System.out.println("De o valor da altura:");
		float altura=sc.nextFloat();
		
		double volumedalata = (Math.PI) *(Math.pow(raio, 2))*altura;
		
		System.out.println("o volume da lata corresponde a:" +volumedalata);
		
		sc.close();
		
		
		
	}
}
