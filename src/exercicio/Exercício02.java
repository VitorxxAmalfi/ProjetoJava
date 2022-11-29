package exercicio;

import java.util.Scanner;

public class Exercício02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
				System.out.println("Digite um numero");
		int numero=sc.nextInt();
		int antecessor=numero-1;
		
		System.out.println("O antecessor do número" +antecessor);
		sc.close();
	}

}
